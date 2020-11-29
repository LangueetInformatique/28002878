package devoir03;

/** Création et gestion de Reptile 
 * 
 * @author mustapha
 *
 */
public class Reptile extends Animal {
	
	private boolean dangereux=false;
	
	/** création d'une nouvelle instance de la classe Reptile, en utilisant le super constructeur
	* @param type nom de l'espèce
	* @param pattes nombre de pattes
	* @param dng true s'il est dangereux, false si le contraire
	*/
	public Reptile(String type,int pattes, boolean dng) {
		super(type,pattes);
		dangereux=dng;
	}
	
	// présentation des caractéristiques du Reptile
	public void presente() {
		super.presente();
		String add=(dangereux) ? "dangereux" : "inoffensif";
		System.out.println("et je suis "+ add);
	}
	
	//Affiche a l'écran une phrase décrivant ce que mange le Reptile
	public void alimentation() {
		System.out.println(" je mange de la viande ou des insects");
	}

}
