package fr.univnantes.alma.hadl.m2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import fr.univnantes.alma.hadl.m2.exception.ServiceException;

public abstract class Service extends Interface {

	private Map<String, Class<?>> params;

	public Service(String name, Type type) {
		super(name, type);
		this.params = new HashMap<String, Class<?>>();
	}

	public Service(String name, Type type, Component component) {
		super(name, type, component);
	}

	public void addParam(String name, Class<?> type) {
		this.params.put(name, type);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[Service " + this.getName() + " has been called with [params="
				+ Arrays.toString(params.entrySet().toArray()) + "]";
	}

	public abstract Object call(Map<String, Object> params) throws ServiceException;
}
