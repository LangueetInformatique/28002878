/*
 * tp2Tokenization.h
 *
 *  Created on: 20 févr. 2021
 *      Author: Mustapha
 */

#ifndef TP2TOKENIZATION_H_
#define TP2TOKENIZATION_H_

#include <iostream>
#include <fstream>
#include <vector>
#include <iterator>
#include <string>
#include <sstream>
#include <regex>
using namespace std;

string lireFichierTexte(string cheminFichier);
vector<string> listeTokens1(string flux);

int compterMots1(string flux);
int renvoieNbreTokens1(string flux);
//	nombre d'occurence de la lettre (e)
int renvoieNbreE(string flux);
//	nombre d'occurence de n'importe quelle lettre (m)
int renvoieNbreLettre(string flux, char lettre);
//Nombre de Tokens en utilisant les regex
int renvoieNbreTokens2(string flux);

#endif /* TP2TOKENIZATION_H_ */
