package fr.univnantes.alma.hadl.m2;

import java.util.HashMap;

import fr.univnantes.alma.hadl.m2.component.Component;
import fr.univnantes.alma.hadl.m2.configuration.Configuration;
import fr.univnantes.alma.hadl.m2.configuration.PortConfiguration;
import fr.univnantes.alma.hadl.m2.connector.Connector;

public class App {

	public static void main(String[] args) {

		Component cp = new Component(null, null, null);
		cp.setName("Server");

		HashMap<String, Component> comps = new HashMap<>();
		comps.put(cp.getName(), cp);

		Connector cnx = new Connector(null, null);

		PortConfiguration portCfg = new PortConfiguration();

		Configuration cfg = new Configuration("CS", comps, null, null);
	}
}
