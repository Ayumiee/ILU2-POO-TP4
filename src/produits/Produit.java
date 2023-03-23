package produits;

import personnages.Gaulois;

public abstract class Produit implements IProduit {
	protected String nom;
	protected Unite unite;
	
	public Produit(String nom,Unite unite) {
		this.nom=nom;
		this.unite=unite;
	}
	

	@Override
	public String getNom() {
		return nom;
	}
	
abstract void description();
	
}


