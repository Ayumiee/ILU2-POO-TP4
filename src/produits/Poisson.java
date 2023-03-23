package produits;

public class Poisson extends Produit {
	private IProduit produits;
	private String date;
	
	public Poisson(String date) {
		super("Poisson",Unite.KILOGRAMME);
		this.date=date;
	}
	
	void description() {
		System.out.println("poisson péché "+this.date);		
	}
}
