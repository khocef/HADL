package fr.univnantes.alma.hadl.m2;

import fr.univnantes.alma.hadl.m2.exception.TypeException;

/**
 * 
 * @author khocef
 *
 */
public abstract class Attachement extends Link {

	public Attachement(String name, Interface required, Interface provided)
			throws TypeException {
		super(name);
		if (this.getProvided().getType().equals(this.getRequired().getType()))
			throw new TypeException();
		this.setProvided(provided);
		this.setRequired(required);
	}
}
