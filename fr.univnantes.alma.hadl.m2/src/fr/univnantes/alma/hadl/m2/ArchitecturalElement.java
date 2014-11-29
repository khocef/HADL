package fr.univnantes.alma.hadl.m2;

/**
 * 
 * @author khocef
 *
 */
public abstract class ArchitecturalElement extends Element {

	private Configuration configuration;
	
	public ArchitecturalElement(String name) {
		super(name);
	}

	/**
	 * @return the configuration
	 */
	public Configuration getConfiguration() {
		return configuration;
	}

	/**
	 * @param configuration the configuration to set
	 */
	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

}
