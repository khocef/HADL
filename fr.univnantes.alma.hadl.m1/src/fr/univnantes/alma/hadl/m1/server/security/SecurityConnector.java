/**
 * 
 */
package fr.univnantes.alma.hadl.m1.server.security;

import java.util.Set;

import fr.univnantes.alma.hadl.m2.Glue;
import fr.univnantes.alma.hadl.m2.PrimitiveConnector;
import fr.univnantes.alma.hadl.m2.Role;

/**
 * @author khocef
 *
 */
public class SecurityConnector extends PrimitiveConnector {

	public SecurityConnector() {
		super("SecurityConnector");
	}
	
	public SecurityConnector(Set<Role> roles, Set<Glue> glues) {
		super("SecurityConnector", roles, glues);
		// TODO Auto-generated constructor stub
	}

}
