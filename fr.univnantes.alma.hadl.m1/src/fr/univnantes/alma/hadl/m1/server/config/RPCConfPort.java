/**
 * 
 */
package fr.univnantes.alma.hadl.m1.server.config;

import fr.univnantes.alma.hadl.m2.Component;
import fr.univnantes.alma.hadl.m2.Port;
import fr.univnantes.alma.hadl.m2.Type;

/**
 * @author khocef
 *
 */
public class RPCConfPort extends Port {

	public RPCConfPort(int portNumber) {
		super("RPCConfPort", Type.REQUIRED, portNumber);
	}

	public RPCConfPort(Type type, Component component, int portNumber) {
		super("RPCConfPort", Type.REQUIRED, component, portNumber);
		// TODO Auto-generated constructor stub
	}

}
