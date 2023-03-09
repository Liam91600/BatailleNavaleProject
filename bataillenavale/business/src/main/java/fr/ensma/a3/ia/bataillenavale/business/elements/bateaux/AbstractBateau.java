package fr.ensma.a3.ia.bataillenavale.business.elements.bateaux;

import fr.ensma.a3.ia.bataillenavale.business.elements.ElementJeu;

public abstract class AbstractBateau extends ElementJeu{
	
	protected Integer taille;
	
	public AbstractBateau(final Integer taille) {
		this.taille = taille;

	}

	public Integer getTaille() {
		return taille;
	}

	public void setTaille(Integer taille) {
		this.taille = taille;
	}


	
	

}
