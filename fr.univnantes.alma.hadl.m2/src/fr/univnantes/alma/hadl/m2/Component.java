package fr.univnantes.alma.hadl.m2;

import java.util.HashSet;
import java.util.Set;

public abstract class Component extends ArchitecturalElement {

	private Set<Interface> interfaces;
	private Set<Link> links;

	public Component(String name) {
		super(name);
		this.interfaces = new HashSet<Interface>();
		this.links = new HashSet<Link>();
	}

	public boolean containsInterface(Interface _interface) {
		return this.interfaces.contains(_interface);
	}

	public boolean addInterface(Interface _interface) {
		return this.interfaces.add(_interface);
	}

	public boolean addInterfaces(Set<Interface> interfaces) {
		return this.interfaces.addAll(interfaces);
	}

	public boolean addInterfaces(Interface... interfaces) {
		boolean b = true;
		for (Interface i : interfaces)
			this.interfaces.add(i);
		return b;
	}

	public boolean removeInterface(Interface _interface) {
		return this.interfaces.remove(_interface);
	}

	// TODO : add methods for Links
}
