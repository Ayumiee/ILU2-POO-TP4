package produits;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private Produit produits;
	private Gaulois chasseur;
	private int poids;
	
	public Sanglier(Gaulois chasseur,int poids) {
		super("sanglier",Unite.KILOGRAMME);
		this.chasseur=chasseur;
		this.poids=poids;
	}
	
	
	void description() {
		System.out.println("sanglier de "+this.poids+this.produits.unite+"chassé par "+this.chasseur);
	}
	
	
}
