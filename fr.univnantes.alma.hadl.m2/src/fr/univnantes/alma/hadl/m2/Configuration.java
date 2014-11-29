package fr.univnantes.alma.hadl.m2;

import java.util.Set;

public abstract class Configuration extends Component {

	private Set<ArchitecturalElement> elements;

	public Configuration(String name, Set<ArchitecturalElement> elements) {
		super(name);
		this.setElements(elements);
	}

	/**
	 * @return the elements
	 */
	public Set<ArchitecturalElement> getElements() {
		return elements;
	}

	/**
	 * @param elements the elements to set
	 */
	private void setElements(Set<ArchitecturalElement> elements) {
		this.elements = elements;
	}

	public void addComponent(ArchitecturalElement component) {
		
	}

}
