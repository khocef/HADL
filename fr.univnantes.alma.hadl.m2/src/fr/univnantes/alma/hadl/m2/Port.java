package fr.univnantes.alma.hadl.m2;

/**
 * 
 * @author khocef
 *
 */
public abstract class Port extends Interface {

	private int portNumber;

	public Port(String name, Type type, int portNumber) {
		super(name, type);
		this.setPortNumber(portNumber);
	}

	public Port(String name, Type type, Component component, int portNumber) {
		super(name, type, component);
		this.setPortNumber(portNumber);
	}

	/**
	 * @return the portNumber
	 */
	public int getPortNumber() {
		return portNumber;
	}

	/**
	 * @param portNumber
	 *            the portNumber to set
	 */
	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
	}

}
