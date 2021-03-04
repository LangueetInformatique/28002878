/*
 * date.h
 *
 *  Created on: 8 févr. 2021
 *      Author: mustapha
 */

#ifndef DATE_H_
#define DATE_H_

#include <iostream>
using namespace std;

class date {
private:
	int jour;
	int mois;
	int annee;
	void lire();

public:
	date();
	date(int j, int m, int a);
	string afficher() const;

	bool compareTo(const date& d)const;
	date& incrementer();
};

#endif /* DATE_H_ */
