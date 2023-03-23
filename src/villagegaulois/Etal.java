package villagegaulois;

import personnages.Gaulois;
import produits.IProduit;
import produits.Produit;

public class Etal <P>{
	private Gaulois vendeur;
	private P[] produit;
	private int nbProduit;
	private int prix;
	
	
	public void installerVendeur(Gaulois vendeur, IProduit[] produit, int prix) {
		this.vendeur = vendeur;
		this.produit = (P[]) produit;
		this.nbProduit =length(produit);
		this.prix = prix;
	}

}
