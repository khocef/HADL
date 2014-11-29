package fr.univnantes.alma.hadl.m2;

public abstract class Role extends Interface {

	public Role(String name, Type type) {
		super(name, type);
	}

	public Role(String name, Type type, Component component) {
		super(name, type, component);
	}

}
