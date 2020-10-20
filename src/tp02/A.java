package tp02;

/**
 * Contient une fonction static permettant de déterminer si une valeur est divisible par 13
 * @author mustapha
 *
 */

public class A {
	/**
	 * Determine si un entier n est divisible par 13
	 * 
	 * @param n une valeur entiere
	 * @return un boolean True si n est divisible par 13, False sinon
	 */
	public static boolean treize(int n){
		//si le modulo de n par 13 est egal a 0 cela signifie qu'il est divisible par 13
		//sinon il n'est pas divisible par 13
		return ((n%13)==0);
	}

}
