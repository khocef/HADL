/**
 * 
 */
package fr.univnantes.alma.hadl.m1.server.auth;

import java.util.Set;

import fr.univnantes.alma.hadl.m2.Glue;
import fr.univnantes.alma.hadl.m2.PrimitiveConnector;
import fr.univnantes.alma.hadl.m2.Role;

/**
 * @author khocef
 *
 */
public class AuthentificationConnector extends PrimitiveConnector {

	public AuthentificationConnector() {
		super("AuthentificationConnector");
		// TODO Auto-generated constructor stub
	}

	public AuthentificationConnector(Set<Role> roles, Set<Glue> glues) {
		super("AuthentificationConnector", roles, glues);
		// TODO Auto-generated constructor stub
	}

}
