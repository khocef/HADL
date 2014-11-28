package fr.univnantes.alma.hadl.m2.component;

import java.util.HashMap;

public class Component {

	private String name;
	private HashMap<String, Port> portsProvided;
	private HashMap<String, Port> portsRequired;
	
	public Component(String name, HashMap<String, Port> portsProvided,
			HashMap<String, Port> portsRequired) {
		super();
		this.name = name;
		this.portsProvided = portsProvided;
		this.portsRequired = portsRequired;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashMap<String, Port> getPortsProvided() {
		return portsProvided;
	}

	public void setPortsProvided(HashMap<String, Port> portsProvided) {
		this.portsProvided = portsProvided;
	}

	public HashMap<String, Port> getPortsRequired() {
		return portsRequired;
	}

	public void setPortsRequired(HashMap<String, Port> portsRequired) {
		this.portsRequired = portsRequired;
	}

	@Override
	public String toString() {
		return "Component [name=" + name + ", portsProvided=" + portsProvided
				+ ", portsRequired=" + portsRequired + "]";
	}
}
