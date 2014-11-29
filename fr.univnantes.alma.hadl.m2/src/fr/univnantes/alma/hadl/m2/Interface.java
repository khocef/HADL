package fr.univnantes.alma.hadl.m2;

/**
 * 
 * @author khocef
 *
 */
public abstract class Interface extends Element {

	private Type type;
	private Component component;

	public Interface(String name, Type type) {
		super(name);
		this.setType(type);
	}

	public Interface(String name, Type type, Component component) {
		super(name);
		this.setType(type);
		this.component = component;
	}

	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * @param component
	 *            the component to set
	 */
	public void setComponent(Component component) {
		this.component = component;
	}

}
