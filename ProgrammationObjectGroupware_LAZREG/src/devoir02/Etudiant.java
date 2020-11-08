
public class Etudiant {
	int numEtudiant;
	String nom;
	String prenom;
	String dateNaissance;
	String classe;
	
	public Etudiant(int nb_etudiant,String nom,String prenom,String date_naissance,String classe) {
		
		this.numEtudiant = nb_etudiant;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = date_naissance;
		this.classe = classe;
		
		
	}

	public int getNumEtudiant() {
		return numEtudiant;
	}

	public void setNumEtudiant(int numEtudiant) {
		this.numEtudiant = numEtudiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	
}

