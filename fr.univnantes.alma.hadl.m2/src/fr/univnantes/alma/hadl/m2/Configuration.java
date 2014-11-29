package fr.univnantes.alma.hadl.m2;

import java.util.Set;

/**
 * 
 * @author khocef
 *
 */
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
	 * @param elements
	 *            the elements to set
	 */
	private void setElements(Set<ArchitecturalElement> elements) {
		this.elements = elements;
	}

	public boolean containsElement(ArchitecturalElement element) {
		return this.elements.contains(element);
	}

	public boolean addElement(ArchitecturalElement element) {
		element.setConfiguration(this);
		return this.elements.add(element);
	}

	public boolean addElements(Set<ArchitecturalElement> elements) {
		for (ArchitecturalElement e : elements)
			e.setConfiguration(this);
		return this.elements.addAll(elements);
	}

	public boolean addElements(ArchitecturalElement... elements) {
		boolean b = true;
		for (ArchitecturalElement e : elements)
			b &= this.elements.add(e);
		return b;
	}

	public boolean removeElement(ArchitecturalElement element) {
		return this.elements.remove(element);
	}
}
