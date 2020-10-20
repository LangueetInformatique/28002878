package tp01;
/*
Exemple d'utilisation d'un commentaire
sur plusieurs lignes. 
*/

public class SimpleProgramme {
	
		public static void main(String[] args){
			String phrase = "Bonjour, je m'appelle Mustapha LAZREG";
			System.out.println(phrase);
			String mots[] = phrase.split(" ");
			for (int i=0; i< mots.length;i++) {
				System.out.println(mots[i]);
			}
		}
}

