package fr.ensma.a3.ia.bataillenavale.business;

import java.util.ArrayList;
import java.util.List;

import fr.ensma.a3.ia.bataillenavale.business.elements.bateaux.AbstractBateau;
import fr.ensma.a3.ia.bataillenavale.business.elements.bateaux.Croiseur;
import fr.ensma.a3.ia.bataillenavale.business.elements.bateaux.PorteAvion;

public class JeuBatailleNavale {
	
	private List<AbstractBateau> listeBateaux;
	
	public JeuBatailleNavale() {
		listeBateaux = new ArrayList<>();
		
		listeBateaux.add(new PorteAvion());
		listeBateaux.add(new Croiseur());
		listeBateaux.add(new Croiseur());
	}
	
	
	public List<AbstractBateau> getBateaux(){
		return listeBateaux;
	}

}
