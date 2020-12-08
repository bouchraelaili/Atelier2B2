package exercice4;

public class Secretaire extends Personne {

	 public int numeroBureau;
	public Secretaire(String nom, String prenom, String adresse, String ville, int dateNaissance,int numeroBureau) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.numeroBureau=numeroBureau;
		// TODO Auto-generated constructor stub
	}
	public Secretaire() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Secretaire numeroBureau=" + numeroBureau + ", Nom=" + getNom() + ", prenom=" + getPrenom()
				+ ", Adress=" + getAdresse() + ", Ville=" + getVille() + ", DateNaissance="
				+ getDateNaissance() + " ";
	}
	
	
	

}
