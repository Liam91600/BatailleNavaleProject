package fr.ensma.a3.ia.bataillenavale.business.elements.bateaux;

import fr.ensma.a3.ia.bataillenavale.business.elements.ElementJeu;

public abstract class AbstractBateau extends ElementJeu{
	
	protected Integer taille;
	protected String nom;
	
	public AbstractBateau(final Integer taille, final String nom) {
		this.taille = taille;
		this.nom = nom;

	}
	

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Integer getTaille() {
		return taille;
	}

	public void setTaille(Integer taille) {
		this.taille = taille;
	}


	
	

}
