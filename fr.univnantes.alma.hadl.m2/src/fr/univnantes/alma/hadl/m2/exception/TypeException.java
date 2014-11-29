package fr.univnantes.alma.hadl.m2.exception;

public class TypeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1605888972812397893L;

	public TypeException() {
	}

	@Override
	public void printStackTrace() {
		System.err.println("[TypeException] : The required interface and"
				+ " the provided interface must be different");
		super.printStackTrace();
	}

	@Override
	public String getMessage() {
		System.err.println("[TypeException] : The required interface and"
				+ " the provided interface must be different");
		return super.getMessage();
	}
}
