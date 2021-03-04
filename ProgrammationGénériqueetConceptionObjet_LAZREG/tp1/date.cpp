/*
 * date.cpp
 *
 *  Created on: 8 févr. 2021
 *      Author: mustapha
 */

#include "date.h"

date::date(){
        date::lire();
}

date::date(int j, int m, int a) {
        jour =j;
        mois =m;
        annee=a;
}

string date::afficher() const{
       string msg = to_string(jour)+"/"+to_string(mois)+"/"+to_string(annee);
       return msg;
}

void date::lire(){
        cout<<"jour :";cin>>jour;
        cout<<"mois :";cin>>mois;
        cout<<"année :";cin>>annee;
}

bool date::compareTo(const date& d) const{
        if (annee != d.annee) return false;
        if (mois != d.mois) return false;
        if (jour != d.jour) return false;
        else return true;
}

date& date::incrementer(){
        int lmois[]={31,28,31,30,31,30,31,31,30,31,30,31};
        //Prise en compte des annes bissextiles
        if (((annee%4)==0) && ((annee%400)==0)){
                lmois[1]++;
        }
        jour ++;
        if (jour>lmois[mois-1]){
                mois++;
                jour=1;
                if (mois==13){
                        annee++;
                        mois=1;
                }
        }
        return *this;

}
