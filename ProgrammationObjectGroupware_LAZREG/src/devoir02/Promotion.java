package devoir02;
/**
 * 
 * @author mustapha
 *
 */

import java.util.*;

public class Promotion {
	String nomPromo;
	List<Etudiant> list_etudiant;
	int nbEtudiant;
	String anneeUniv;
	String matieres[];
	
	public Promotion(String nom,List<Etudiant> list_etu,int nombre, String annee,String matieres[]) {
		this.nomPromo=nom;
		this.list_etudiant =list_etu;
		this.nbEtudiant=nombre;
		this.anneeUniv=annee;
		this.matieres=matieres;
	}
	
	
	public void addEtudiant(Etudiant e ) {
		this.list_etudiant.add(e);
	}
	
	public int getNbetudiant() {
		return this.nbEtudiant;
	}
	
	public boolean isEtudiantProm(Etudiant e) {
		
		
		for(int i=0; i<list_etudiant.size();i++) {
			if(list_etudiant.get(i).equals(e)) {
				return true;
				
			}
				
			
		}
		return false;
	}


	public String getNomPromo() {
		return nomPromo;
	}


	public void setNomPromo(String nomPromo) {
		this.nomPromo = nomPromo;
	}


	public List<Etudiant> getList_etudiant() {
		return list_etudiant;
	}


	public void setList_etudiant(List<Etudiant> list_etudiant) {
		this.list_etudiant = list_etudiant;
	}


	public int getNbEtudiant() {
		return nbEtudiant;
	}


	public void setNbEtudiant(int nbEtudiant) {
		this.nbEtudiant = nbEtudiant;
	}


	public String getAnneeUniv() {
		return anneeUniv;
	}


	public void setAnneeUniv(String anneeUniv) {
		this.anneeUniv = anneeUniv;
	}


	public String[] getMatieres() {
		return matieres;
	}


	public void setMatieres(String[] matieres) {
		this.matieres = matieres;
	}
	
}
