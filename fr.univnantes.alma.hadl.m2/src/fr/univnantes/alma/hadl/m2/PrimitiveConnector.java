package fr.univnantes.alma.hadl.m2;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author khocef
 *
 */
public abstract class PrimitiveConnector extends Element {

	private Set<Role> roles;
	private Set<Glue> glues;

	public PrimitiveConnector(String name) {
		super(name);
		this.roles = new HashSet<Role>();
		this.glues = new HashSet<Glue>();
	}

	public PrimitiveConnector(String name, Set<Role> roles, Set<Glue> glues) {
		super(name);
		this.roles = roles;
		this.glues = glues;
	}

	public Set<Glue> getGlues() {
		return glues;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public boolean containRole(Role role) {
		return this.roles.contains(role);
	}

	public boolean containGlue(Glue glue) {
		return this.glues.contains(glue);
	}

	public boolean addGlues(Set<Glue> glues) {
		return this.glues.addAll(glues);
	}

	public boolean addGlues(Glue... glues) {
		boolean b = true;
		for (Glue g : glues)
			b &= this.glues.add(g);
		return b;
	}

	public boolean addRoles(Set<Role> roles) {
		return this.roles.addAll(roles);
	}

	public boolean addRoles(Role... roles) {
		boolean b = true;
		for (Role g : roles)
			b &= this.roles.add(g);
		return b;
	}

	public boolean removeGlue(Glue glue) {
		return this.glues.remove(glue);
	}

	public boolean removeRole(Role role) {
		return this.roles.remove(role);
	}

}
