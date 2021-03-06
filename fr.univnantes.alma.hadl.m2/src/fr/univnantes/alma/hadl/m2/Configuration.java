package fr.univnantes.alma.hadl.m2;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import fr.univnantes.alma.hadl.m2.exception.ServiceException;

/**
 * 
 * @author khocef
 */
public abstract class Configuration extends Component {

	private Set<ArchitecturalElement> elements;

	// TODO : Should add properties and constraints ?

	/**
	 * 
	 * @param name
	 * @param elements
	 */
	public Configuration(String name, Interface _interface) {
		super(name, _interface);
		this.elements = new HashSet<ArchitecturalElement>();
	}

	/**
	 * @return the Configuration elements
	 */
	public Set<ArchitecturalElement> getElements() {
		return elements;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	public boolean containsElement(ArchitecturalElement element) {
		return this.elements.contains(element);
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	public boolean addElement(ArchitecturalElement element) {
		element.setConfiguration(this);
		return this.elements.add(element);
	}

	/**
	 * 
	 * @param elements
	 * @return
	 */
	public boolean addElements(Set<ArchitecturalElement> elements) {
		for (ArchitecturalElement e : elements)
			e.setConfiguration(this);
		return this.elements.addAll(elements);
	}

	/**
	 * 
	 * @param elements
	 * @return
	 */
	public boolean addElements(ArchitecturalElement... elements) {
		boolean b = true;
		for (ArchitecturalElement e : elements)
			b &= this.elements.add(e);
		return b;
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	public boolean removeElement(ArchitecturalElement element) {
		return this.elements.remove(element);
	}

	/**
	 * check whether if the configuration contains or not a given service
	 * 
	 * @param service
	 * @return
	 */
	public boolean containsService(Service service) {
		if (super.hasService(service))
			return true;
		for (ArchitecturalElement e : this.elements) {
			if (e instanceof Component && ((Component) e).hasService(service))
				return true;
			else if (e instanceof Configuration
					&& ((Configuration) e).containsService(service))
				return true;
		}
		return false;
	}

	/**
	 * 
	 * @param name
	 * @param params
	 * @param port
	 * @return
	 */
	@Override
	public Object callService(String name, Map<String, Object> params) {
		// TODO Auto-generated method stub
		Service service = null;
		for (Interface i : this.getInterfaces())
			if (i instanceof Service
					&& ((Service) i).getName().equalsIgnoreCase(name))
				service = (Service) i;

		if (service == null) {
			for (ArchitecturalElement e : this.elements) {
				if (e instanceof Configuration) {
					if (((Configuration) e).hasService(service)) {
						Object result = this.callServiceToConfiguration(name,
								params, (Configuration) e);
						return result;
					}
				}

				/*
				 * TODO : Searsh through links {binding} -> {interfaces} to find
				 * port
				 */
				else if (e instanceof Component) {
					for (Interface i : this.getInterfaces())
						if (i.getName().equalsIgnoreCase(name))
							service = (Service) i;
				}
			}
		}
		if (service != null) {
			System.out.println("[Configuration " + this.getName()
					+ " call Service " + service.getName() + "]");
			/* Call the service */
			Object result;
			try {
				result = service.call(params);
				if (result == null)
					System.out.println("[Configuration " + this.getName()
							+ " received response from Service "
							+ service.getName());
				else
					System.out.println("[Configuration " + this.getName()
							+ " no response recieved from Service "
							+ service.getName());
				return result;
			} catch (ServiceException e) {
				e.printStackTrace();
				return null;
			}

		}
		System.err.println("[Configuration " + this.getName()
				+ "] Error: Can't find the service {" + name + "}");
		return null;
	}

	/**
	 * 
	 * @param name
	 * @param params
	 * @param configuration
	 * @return
	 */
	public Object callServiceToConfiguration(String name,
			Map<String, Object> params, Configuration configuration) {
		return null;
	}

	public Object callServiceFromPort(String name, Map<String, Object> params,
			Port port) {
		Role role = getAttachedProvidedPort(port);
		if (role != null) {
			// TODO : Do Something ??????
		}
		return null;
	}

	/**
	 * get role attached to the provided port
	 * 
	 * @param port
	 * @return
	 */
	public Role getAttachedProvidedPort(Port port) {
		for (Link l : this.getLinks()) {
			if (l instanceof Attachement) {
				if (l.getRequired().equals(port)) {
					if (l.getProvided() instanceof Role) {
						System.out.println("[Configuration " + this.getName()
								+ "] Using Attachement " + l.getName() + " ");
						System.out.println("\tRole{"
								+ l.getRequired().getName() + "  -> Port "
								+ l.getProvided().getName() + " ");
						return (Role) l.getProvided();
					}
				}
			}
		}
		return null;
	}

	/**
	 * get role attached from the required port
	 * 
	 * @param port
	 * @return
	 */
	public Role getAttachedRequiredPort(Port port) {
		for (Link l : this.getLinks()) {
			if (l instanceof Attachement) {
				if (l.getProvided().equals(port)) {
					if (l.getRequired() instanceof Role) {
						System.out.println("[Configuration " + this.getName()
								+ "] Using Attachement " + l.getName() + " ");
						System.out.println("\tRole{"
								+ l.getRequired().getName() + "  -> Port "
								+ l.getProvided().getName() + " ");
						return (Role) l.getRequired();
					}
				}
			}
		}
		return null;
	}

	/**
	 * get port attached to the provided role
	 * 
	 * @param role
	 * @return
	 */
	public Port getAttachedProvidedRole(Role role) {
		for (Link l : this.getLinks()) {
			if (l instanceof Attachement) {
				if (((Attachement) l).getProvided().equals(role)) {
					System.out.println("[Configuration " + this.getName()
							+ " ] Using Attachement " + l.getName() + " ");
					System.out.println("\tPort " + l.getRequired().getName()
							+ "  -> Role " + l.getProvided().getName() + " ");
					return (Port) l.getRequired();
				}
			}
		}
		return null;
	}

	/**
	 * get port attached from the required role
	 * 
	 * @param role
	 * @return
	 */
	public Port getAttachedRequiredRole(Role role) {
		for (Link l : this.getLinks()) {
			if (l instanceof Attachement) {
				if (((Attachement) l).getRequired().equals(role)) {
					System.out.println("[Configuration " + this.getName()
							+ " ] Using Attachement " + l.getName() + " ");
					System.out.println("\tRole " + l.getRequired().getName()
							+ "  -> Port " + l.getProvided().getName() + " ");
					return (Port) l.getProvided();
				}
			}
		}
		return null;
	}
}
