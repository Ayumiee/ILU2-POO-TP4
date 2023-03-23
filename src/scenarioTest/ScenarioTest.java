package scenarioTest;

import produits.Poisson;
import produits.Sanglier;
import villagegauloisold.Etal;
import villagegauloisold.IEtal;
import produits.Produit;

public class ScenarioTest {
	public static void main(String[] args) {
		IEtal[] marche = new IEtal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();
		marche[0] = (IEtal) etalSanglier;
		//marche[1] = etalPoisson;
	}
	
}
