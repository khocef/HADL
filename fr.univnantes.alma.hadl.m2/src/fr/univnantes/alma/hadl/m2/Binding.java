package fr.univnantes.alma.hadl.m2;

import fr.univnantes.alma.hadl.m2.exception.DiffrentTypesBindingException;

/**
 * 
 * @author khocef
 *
 */
public abstract class Binding extends Link {

	public Binding(String name, Interface required, Interface provided)
			throws DiffrentTypesBindingException {
		super(name);
		if (!this.getRequired().getType().equals(required.getType()))
			throw new DiffrentTypesBindingException();
		if (!this.getProvided().getType().equals(provided.getType()))
			throw new DiffrentTypesBindingException();
		this.setProvided(provided);
		this.setRequired(required);
	}

}
