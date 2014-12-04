/**
 * 
 */
package fr.univnantes.alma.hadl.m1.server.database;

import java.util.Set;

import fr.univnantes.alma.hadl.m2.Glue;
import fr.univnantes.alma.hadl.m2.PrimitiveConnector;
import fr.univnantes.alma.hadl.m2.Role;

/**
 * @author khocef
 *
 */
public class DatabaseConnector extends PrimitiveConnector {

	public DatabaseConnector() {
		super("DatabaseConnector");
		// TODO Auto-generated constructor stub
	}
	
	public DatabaseConnector(Set<Role> roles, Set<Glue> glues) {
		super("DatabaseConnector", roles, glues);
		// TODO Auto-generated constructor stub
	}

}
