package fr.univnantes.alma.hadl.m2.configuration;

import java.util.HashMap;
import java.util.Map;

import fr.univnantes.alma.hadl.m2.component.Component;
import fr.univnantes.alma.hadl.m2.component.Port;
import fr.univnantes.alma.hadl.m2.component.PortProvided;
import fr.univnantes.alma.hadl.m2.component.PortRequired;
import fr.univnantes.alma.hadl.m2.connector.Connector;
import fr.univnantes.alma.hadl.m2.connector.Role;
import fr.univnantes.alma.hadl.m2.connector.RoleProvided;
import fr.univnantes.alma.hadl.m2.connector.RoleRequired;

public class Configuration {

	private String name;
	private HashMap<String, Component> components;
	private HashMap<String, Connector> connectors;
	private HashMap<String, PortConfiguration> portConfiguration;

	private HashMap<RoleRequired, PortProvided> attachementsProvided;
	private HashMap<RoleProvided, PortRequired> attachementsRequired;
	private HashMap<Port, Port> bindings;
	public Configuration(String name, HashMap<String, Component> components,
			HashMap<String, Connector> connectors,
			HashMap<String, PortConfiguration> portConfiguration,
			HashMap<RoleRequired, PortProvided> attachementsProvided,
			HashMap<RoleProvided, PortRequired> attachementsRequired,
			HashMap<Port, Port> bindings) {
		super();
		this.name = name;
		this.components = components;
		this.connectors = connectors;
		this.portConfiguration = portConfiguration;
		this.attachementsProvided = attachementsProvided;
		this.attachementsRequired = attachementsRequired;
		this.bindings = bindings;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the components
	 */
	public HashMap<String, Component> getComponents() {
		return components;
	}
	/**
	 * @param components the components to set
	 */
	public void setComponents(HashMap<String, Component> components) {
		this.components = components;
	}
	/**
	 * @return the connectors
	 */
	public HashMap<String, Connector> getConnectors() {
		return connectors;
	}
	/**
	 * @param connectors the connectors to set
	 */
	public void setConnectors(HashMap<String, Connector> connectors) {
		this.connectors = connectors;
	}
	/**
	 * @return the portConfiguration
	 */
	public HashMap<String, PortConfiguration> getPortConfiguration() {
		return portConfiguration;
	}
	/**
	 * @param portConfiguration the portConfiguration to set
	 */
	public void setPortConfiguration(
			HashMap<String, PortConfiguration> portConfiguration) {
		this.portConfiguration = portConfiguration;
	}
	/**
	 * @return the attachementsProvided
	 */
	public HashMap<RoleRequired, PortProvided> getAttachementsProvided() {
		return attachementsProvided;
	}
	/**
	 * @param attachementsProvided the attachementsProvided to set
	 */
	public void setAttachementsProvided(
			HashMap<RoleRequired, PortProvided> attachementsProvided) {
		this.attachementsProvided = attachementsProvided;
	}
	/**
	 * @return the attachementsRequired
	 */
	public HashMap<RoleProvided, PortRequired> getAttachementsRequired() {
		return attachementsRequired;
	}
	/**
	 * @param attachementsRequired the attachementsRequired to set
	 */
	public void setAttachementsRequired(
			HashMap<RoleProvided, PortRequired> attachementsRequired) {
		this.attachementsRequired = attachementsRequired;
	}
	/**
	 * @return the bindings
	 */
	public HashMap<Port, Port> getBindings() {
		return bindings;
	}
	/**
	 * @param bindings the bindings to set
	 */
	public void setBindings(HashMap<Port, Port> bindings) {
		this.bindings = bindings;
	}

	

}
