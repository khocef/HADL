package fr.univnantes.alma.hadl.m2;

public abstract class Service extends Interface {

	public Service(String name, Type type) {
		super(name, type);
	}
	
	public Service(String name, Type type, Component component) {
		super(name, type, component);
	}

}
