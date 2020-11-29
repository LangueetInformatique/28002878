package devoir03;

/**Création et gestion d'animaux
 * 
 * @author mustapha
 *
 */
public class Phyllodactylidae extends Reptile {
	
	private int poidsGr;
	
	/** création d'une nouvelle instance de la classe Phyllodactylidae, en utilisant le super constructeur
	* @param int le poids du Gecko
	*/
	public Phyllodactylidae(int pd) {
		super("Phyllodactylidae",4,false);
		poidsGr=pd;
	}
	
	/**renvoie le poids du Phyllodactylidae
	 * 
	 * @return int le poids en gramme
	 */
	public int getPoids() {
		return poidsGr;
	}
	
	/**Augmente le poids du Phyllodactylidae selon le paramêtre, affiche un message selon un seuil
	 * 
	 * @param pd le gain de poids voulu
	 */
	public void gagnePoids(int pd) {
		if((poidsGr+pd)<150) {
			poidsGr+=pd;
		}else {
			
			poidsGr+=pd;
			System.out.println(poidsGr+"grammes attention le Phyllodactylidae est obèse");
		}
	}
	
	/**Diminue le poids du Gecko selon le paramêtre, affiche un message selon un seuil
	 * 
	 * @param pd la perte de poids voulu
	 */
	public void perdPoids(int pd) {
		if((poidsGr-pd)<60) {
			poidsGr-=pd;
			System.out.println(poidsGr+"grammes attention le Phyllodactylidae est trop maigre!");
		}else {
			poidsGr-=pd;
		}
	}
	
	//présentation des caractéristiques du Gecko
	
	public void presente() {
		super.presente();
		System.out.println("Je pèse "+poidsGr+" grammes");
	}
	
	//Affiche a l'écran un phrase décrivant l'alimentation du Gecko
	
	public void alimentation() {
		System.out.println(" je mange des insectes");
	}
}
