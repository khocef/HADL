package fr.univnantes.alma.hadl.m2;

import fr.univnantes.alma.hadl.m2.exception.TypeException;

public abstract class Glue extends Element {

	private Role required;
	private Role provided;

	public Glue(String name) {
		super(name);
	}

	public Glue(String name, Role required, Role provided) throws TypeException {
		super(name);
		if (this.required.getType().equals(this.provided.getType()))
			throw new TypeException();
		this.required = required;
		this.provided = provided;
	}

	/**
	 * @return the required
	 */
	public Role getRequired() {
		return required;
	}

	/**
	 * @param required
	 *            the required to set
	 */
	public void setRequired(Role required) {
		this.required = required;
	}

	/**
	 * @return the provided
	 */
	public Role getProvided() {
		return provided;
	}

	/**
	 * @param provided
	 *            the provided to set
	 */
	public void setProvided(Role provided) {
		this.provided = provided;
	}
}
