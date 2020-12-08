package exercice4;

public class Etudiant extends Personne{
public String diplome;

public Etudiant(String nom, String prenom, String adresse, String ville, int dateNaissance,String diplome) {
	super(nom, prenom, adresse, ville, dateNaissance);
	this.diplome=diplome;
	// TODO Auto-generated constructor stub
}
public Etudiant() {
}
	@Override
	public String toString() {
		return "Etudiant diplome=" + diplome + ", Nom=" + getNom() + ", Prenom=" + getPrenom()
				+ ", Adresse=" + getAdresse() + ", Ville=" + getVille() + ", DateNaissance="
				+ getDateNaissance() + ", ";
	}

}
