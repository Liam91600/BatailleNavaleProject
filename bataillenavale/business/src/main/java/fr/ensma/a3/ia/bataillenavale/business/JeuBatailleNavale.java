package fr.ensma.a3.ia.bataillenavale.business;

import java.util.ArrayList;
import java.util.List;

import fr.ensma.a3.ia.bataillenavale.business.elements.bateaux.AbstractBateau;
import fr.ensma.a3.ia.bataillenavale.business.elements.bateaux.ContreTorpilleur;
import fr.ensma.a3.ia.bataillenavale.business.elements.bateaux.Croiseur;
import fr.ensma.a3.ia.bataillenavale.business.elements.bateaux.PorteAvions;
import fr.ensma.a3.ia.bataillenavale.business.elements.bateaux.SousMarin;
import fr.ensma.a3.ia.bataillenavale.business.elements.bateaux.Torpilleur;

public class JeuBatailleNavale {
	
	private List<AbstractBateau> listeBateaux;
	
	public JeuBatailleNavale() {
		listeBateaux = new ArrayList<>();
		
		listeBateaux.add(new PorteAvions());
		listeBateaux.add(new Croiseur());
		listeBateaux.add(new ContreTorpilleur());
		listeBateaux.add(new Torpilleur());
		listeBateaux.add(new SousMarin());
	}
	
	
	public List<AbstractBateau> getBateaux(){
		return listeBateaux;
	}

}
