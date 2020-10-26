package tp02;
/**
 * Contient une fonction qui à partir d'un entier n renvoie soit n/2 soit n+2 respectivement si n est divisible par 13 ou non 
 * @author mustapha
 *
 */

public class B {
	/**
	 * Permet a partir d'un entier n de recuperer un float n/2 si n est divisible par 13 et n+2 sinon
	 * 
	 * @param n une valeur entiere
	 * @return un float n/2 si n est divisible par 13, n+2 sinon
	 */
	public static float divise(int n){
		//revoit le resultat d'un operateur ternaire, n/2 si treize(n) est vrai, n+2 s'il est faut
		return (A.treize(n)) ? (n/2) : (n+2);
	}
}
