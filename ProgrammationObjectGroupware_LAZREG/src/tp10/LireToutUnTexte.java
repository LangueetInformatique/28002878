package tp10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LireToutUnTexte {
	private String Stexte;

	/**
	 * lecture d'un fichier texte dans la chaîne sTexte
	 * 
	 * @param ft descripteur du fichier
	 * @throws IOException 
	 */
	public LireToutUnTexte(File ft) throws IOException {
		String ligne = null;
		Stexte = "";


			try (BufferedReader br = new BufferedReader(new FileReader(ft))) {
				while ((ligne = br.readLine()) != null) {
					System.out.println(ligne);
					Stexte += ligne;
				}
			}

		}


}
