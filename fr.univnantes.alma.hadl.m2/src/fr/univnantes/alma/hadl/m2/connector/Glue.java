package fr.univnantes.alma.hadl.m2.connector;

import java.util.HashMap;

public class Glue {

	private String name;
	private HashMap<String, Role> rolesRequired;
	private HashMap<String, Role> rolesProvided;

	public Glue(String name, HashMap<String, Role> rolesRequired,
			HashMap<String, Role> rolesProvided) {
		super();
		this.name = name;
		this.rolesRequired = rolesRequired;
		this.rolesProvided = rolesProvided;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashMap<String, Role> getRolesProvided() {
		return rolesProvided;
	}

	public void setRolesProvided(HashMap<String, Role> rolesProvided) {
		this.rolesProvided = rolesProvided;
	}

	public HashMap<String, Role> getRolesRequired() {
		return rolesRequired;
	}

	public void setRolesRequired(HashMap<String, Role> rolesRequired) {
		this.rolesRequired = rolesRequired;
	}
}
