package devoir03;


// Création et gestion de Crocodile

public class Crocodile extends Reptile{
	
	private int nbDents;
	
	// création d'une nouvelle instance de la classe Crocodile, en utilisant le super constructeur
	
	
	public Crocodile() {
		super("Crocodile",4,true);
		nbDents=80;
	}
	
	/** Revoit la valeur de l'attribut nbDents
	 * @return int le nombre de dents su Crocodile
	*/
	
	public int dents() {
		return nbDents;
	}
	
	// présentation des caractéristiques du Crocodile
	
	public void presente() {
		super.presente();
		System.out.println("J'ai "+nbDents+" dents");
	}
	
	//Affiche a l'écran une phrase décrivant ce que mange le Crocodile
	
	public void alimentation() {
		System.out.println(" je mange de la viande");
	}
	
}
