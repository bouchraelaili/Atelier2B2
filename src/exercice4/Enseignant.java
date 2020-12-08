package exercice4;

public class Enseignant extends Personne {
	public String specialie;

	public Enseignant(String nom, String prenom, String adresse, String ville, int dateNaissance,String specialie) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.specialie=specialie;
		// TODO Auto-generated constructor stub
	}
	public Enseignant() {
		
	}

	@Override
	public String toString() {
		return "Enseignant specialie=" + specialie + ", Nom=" + getNom() + ", Prenom=" + getPrenom()
				+ ", Adresse=" + getAdresse() + ", Ville=" + getVille() + ", DateNaissance="
				+ getDateNaissance() + ",  ";
	}

}
