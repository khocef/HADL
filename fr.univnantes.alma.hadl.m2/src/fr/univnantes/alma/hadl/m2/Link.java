package fr.univnantes.alma.hadl.m2;

/**
 * 
 * @author khocef
 *
 */
public abstract class Link extends Element {

	private Interface required;
	private Interface provided;

	public Link(String name) {
		super(name);
	}

	public Link(String name, Interface required, Interface provided) {
		super(name);
		this.required = required;
		this.provided = provided;
	}

	/**
	 * @return the required
	 */
	public Interface getRequired() {
		return required;
	}

	/**
	 * @param required
	 *            the required to set
	 */
	public void setRequired(Interface required) {
		this.required = required;
	}

	/**
	 * @return the provided
	 */
	public Interface getProvided() {
		return provided;
	}

	/**
	 * @param provided
	 *            the provided to set
	 */
	public void setProvided(Interface provided) {
		this.provided = provided;
	}

}
