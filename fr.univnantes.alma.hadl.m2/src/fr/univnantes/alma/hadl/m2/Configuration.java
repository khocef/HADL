package fr.univnantes.alma.hadl.m2;

import java.util.Map;
import java.util.Set;

/**
 * 
 * @author khocef
 */
public abstract class Configuration extends Component {

	private Set<ArchitecturalElement> elements;

	// TODO : Should add properties and constraints ??

	/**
	 * 
	 * @param name
	 * @param elements
	 */
	public Configuration(String name, Set<ArchitecturalElement> elements) {
		super(name);
		this.setElements(elements);
	}

	/**
	 * @return the Configuration elements
	 */
	public Set<ArchitecturalElement> getElements() {
		return elements;
	}

	/**
	 * @param elements
	 *            the Configuration elements to set
	 */
	private void setElements(Set<ArchitecturalElement> elements) {
		this.elements = elements;
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
		if (super.containsService(service))
			return true;
		for (ArchitecturalElement e : this.elements) {
			if (e instanceof Component
					&& ((Component) e).containsService(service))
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
	public Object callServiceFromPort(String name, Map<String, Object> params,
			Port port) {
		// TODO Auto-generated method stub
		Service service = null;
		for (Interface i : this.getInterfaces())
			if (i instanceof Service
					&& ((Service) i).getName().equalsIgnoreCase(name))
				service = (Service) i;
		if (service == null) {
			for (ArchitecturalElement e : this.elements) {
				if (e instanceof Configuration
						&& ((Configuration) e).containsService(service)) {
					Object result = null;
					return result;
				} else if (e instanceof Component) {

				}
			}
		}
		return null;
	}
}
