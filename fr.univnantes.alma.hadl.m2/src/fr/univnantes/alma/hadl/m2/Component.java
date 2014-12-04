package fr.univnantes.alma.hadl.m2;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class Component extends ArchitecturalElement {

	private Set<Interface> interfaces;
	private Set<Link> links;

	public Component(String name, Interface _interface) {
		super(name);
		this.interfaces = new HashSet<Interface>();
		this.links = new HashSet<Link>();
		this.interfaces.add(_interface);
	}

	/**
	 * 
	 * @return
	 */
	public Set<Interface> getInterfaces() {
		return interfaces;
	}

	/**
	 * 
	 * @return
	 */
	public Set<Link> getLinks() {
		return links;
	}

	/**
	 * 
	 * @param _interface
	 * @return
	 */
	public boolean containsInterface(Interface _interface) {
		return this.interfaces.contains(_interface);
	}

	/**
	 * 
	 * @param _interface
	 * @return
	 */
	public boolean addInterface(Interface _interface) {
		return this.interfaces.add(_interface);
	}

	/**
	 * 
	 * @param interfaces
	 * @return
	 */
	public boolean addInterfaces(Set<Interface> interfaces) {
		return this.interfaces.addAll(interfaces);
	}

	/**
	 * 
	 * @param interfaces
	 * @return
	 */
	public boolean addInterfaces(Interface... interfaces) {
		boolean b = true;
		for (Interface i : interfaces)
			b &= this.interfaces.add(i);
		return b;
	}

	/**
	 * 
	 * @param _interface
	 * @return
	 */
	public boolean removeInterface(Interface _interface) {
		return this.interfaces.remove(_interface);
	}

	/**
	 * 
	 * @param link
	 * @return
	 */
	public boolean containsLink(Link link) {
		return this.links.contains(link);
	}

	/**
	 * 
	 * @param link
	 * @return
	 */
	public boolean addLink(Link link) {
		return this.links.add(link);
	}

	/**
	 * 
	 * @param links
	 * @return
	 */
	public boolean addLinks(Set<Link> links) {
		return this.links.addAll(links);
	}

	/**
	 * 
	 * @param links
	 * @return
	 */
	public boolean addLinks(Link... links) {
		boolean b = true;
		for (Link l : links)
			b &= this.links.add(l);
		return b;
	}

	/**
	 * 
	 * @param link
	 * @return
	 */
	public boolean removeLink(Link link) {
		return this.links.remove(link);
	}

	public boolean hasService(Service service) {
		for (Interface i : this.interfaces)
			if (i instanceof Service
					&& ((Service) i).getName().equalsIgnoreCase(
							service.getName()))
				return true;
		return false;
	}

	/**
	 * 
	 * @param name
	 * @param params
	 * @return
	 */
	public Object callService(String name, Map<String, Object> params) {
		for (Interface i : this.interfaces) {
			if (i instanceof Port && i.getType().equals(Type.REQUIRED)) {
				// TODO : Add Call Trace here
				System.out
						.println("[Component " + this.getName()
								+ " called Service " + name + " on Port "
								+ i.getName());
				return this.getConfiguration().callServiceFromPort(name,
						params, (Port) i);
			}
		}
		return null;
	}
}
