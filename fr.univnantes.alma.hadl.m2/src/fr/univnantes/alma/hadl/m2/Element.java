package fr.univnantes.alma.hadl.m2;

/**
 * 
 * @author khocef
 *
 */
public abstract class Element {
	private String name;

	public Element(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the element name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param the element name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Element [name=" + name + "]";
	}
}
