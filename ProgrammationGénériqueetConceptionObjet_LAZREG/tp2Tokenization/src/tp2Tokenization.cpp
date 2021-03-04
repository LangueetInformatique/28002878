//============================================================================
// Name        : tp2Tokenization.cpp
// Author      : Mustapha
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include "tp2Tokenization.h"

string lireFichierTexte(string cheminFichier) {
	ifstream fichier(cheminFichier);
	string contenu = "";
	if (fichier.fail()) {
		cout << "Impossible d'ouvrir le fichier" << endl;
	}
	else {
		stringstream buffer;
		buffer << fichier.rdbuf();
		contenu = buffer.str();
	}
	return contenu;
}
//==============================================================
vector<string> listeTokens1(string flux){
	string token="";
	int nbLettres = flux.length();
		vector<string> tabTaken;
		short i(0);
		while (i<nbLettres){
			if (flux[i]!=' ' && flux[i]!='\n'){
				token=token+flux[i];
			}
			else{
			tabTaken.push_back(token);
			token="";
			}
			i++;
		}
		if (i==nbLettres) tabTaken.push_back(token);
		return tabTaken;
}
//==============================================================
int compterMots1(string flux){
	string t="";
	vector<string> tabToken;
	tabToken = listeTokens1(flux);
	return tabToken.size();
}
//==============================================================
int renvoieNbreTokens1(string texte) {
	int nbTokens = 0;
	if (texte.length() > 0)
	for (int i = 0; i < int(texte.length()); i++) {
		if (texte[i] == ' ') {
			nbTokens++;
		}
	}
	return nbTokens+1;
}
//==============================================================
int renvoieNbreE(string flux){
	short nbE=0, sizeFlux =flux.size(), i(0);
	while (i<sizeFlux){
		if (flux[i]=='e'||flux[i]=='E')
			nbE++;
		i++;
	}
	return nbE;
}
//==============================================================
int renvoieNbreLettre(string flux, char lettre){
	short nbLettre=0, sizeFlux =flux.size(), i=0;
	while (i<sizeFlux){
		if (flux[i]==lettre)
			nbLettre++;
		i++;
	}
	return nbLettre;
}
//==============================================================
int renvoieNbreTokens2(string texte){
	short nbTokens=1;
	short size_phrase = texte.size();
	regex word_regex("[^0-9A-Za-z]");
		for(short i=0;i<size_phrase;i++) {
			string s(1,texte[i]);
			if (regex_match(s, word_regex)) {
				nbTokens++;
			}
		}
		return nbTokens;
}
//==============================================================
