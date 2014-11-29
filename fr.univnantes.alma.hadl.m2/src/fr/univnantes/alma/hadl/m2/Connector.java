package fr.univnantes.alma.hadl.m2;

import java.util.HashMap;

public class Connector {

	private String name;
	private HashMap<String , Glue> glues;
	
	public Connector(String name, HashMap<String, Glue> glues) {
		super();
		this.name = name;
		this.glues = glues;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setGlues(HashMap<String, Glue> glues) {
		this.glues = glues;
	}
	
	public HashMap<String, Glue> getGlues() {
		return glues;
	}
}
