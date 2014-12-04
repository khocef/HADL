/**
 * 
 */
package fr.univnantes.alma.hadl.m1.configuration;

import fr.univnantes.alma.hadl.m2.Binding;
import fr.univnantes.alma.hadl.m2.Interface;
import fr.univnantes.alma.hadl.m2.exception.DiffrentTypesBindingException;

/**
 * @author khocef
 *
 */
public class RPCBinding extends Binding {

	public RPCBinding(Interface required, Interface provided)
			throws DiffrentTypesBindingException {
		super("RPCBinding", required, provided);
		// TODO Auto-generated constructor stub
	}

}
