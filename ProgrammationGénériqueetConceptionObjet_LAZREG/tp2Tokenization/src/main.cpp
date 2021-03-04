//============================================================================
// Name        : tp2Tokenization.cpp
// Author      : Mustapha
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================




#include "tp2Tokenization.h"

int main() {
	string petitePhrase = "hello, le soleil brille, brille aujourd’hui… ";
		vector<string> vecteurDeToken;
		vecteurDeToken = listeTokens1(petitePhrase);
		short nbToken = vecteurDeToken.size();
		cout << " Les tokens de la petite phrase donnée en exemple sont :"<< endl;
		for (short i=0; i<nbToken;++i){
			cout <<vecteurDeToken[i]<<endl;
		}
		cout<<endl<<string(50,'-')<<endl;

	string cheminFichier = "./src/Adelaide.txt";
	string 	flux = lireFichierTexte(cheminFichier);

	cout<< "Le nombre de tokens qui se trouvent dans le texte est : "<<compterMots1(flux)<<endl;
	cout<<endl<<string(50,'-')<<endl;
	cout << "Le nombre de tokens en comptant le nombre d'espace qui se trouve dans le text est : "<<renvoieNbreTokens1(flux)<<endl;
	cout<<endl<<string(50,'-')<<endl;
	cout<< "nombre de lettre e dans notre fichier est : "<<renvoieNbreE(flux)<<endl;
	cout<<endl<<string(50,'-')<<endl;
	char lettre ='m';
	cout<< "nombre de lettre "<<lettre<<" dans notre text est : "<<renvoieNbreLettre(flux,lettre)<<endl;
	cout<<endl<<string(50,'-')<<endl;
	cout << "Le nombre de tokens qui se trouvent dans ce text (en utilisant la méthode 2) est : "<<renvoieNbreTokens2(flux)<<endl;
	cout<<endl<<string(50,'-')<<endl;
	return 0;
}

