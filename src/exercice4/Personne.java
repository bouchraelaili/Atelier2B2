package exercice4;

import java.util.ArrayList;
import java.util.Arrays;

public class Personne {

	
	private String nom,  prenom, ville,adresse;
	private int dateNaissance;
	
	
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(int dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public Personne(String nom, String prenom, String adresse, String ville, int dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.dateNaissance = dateNaissance;
	}
	public Personne() {
		
	}
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", ville=" + ville
				+ ", dateNaissance=" + dateNaissance + "]";
	}
	
	public void ModifierPersonne() {
		
		ArrayList<String> adresse = new ArrayList<String>(Arrays.asList( "safi", "casa", "jadida") );
        
        System.out.println(adresse);  //list size is 3
         
        //Add element at 0 index
        adresse.set(0, "tanger");
         
        System.out.println("nouvelle adresse est : "+adresse); 
		
	}
	
	
	/*public String editPerson(ArrayList<Personne> listPerson, Personne nouvadress, int index) {
		try {
			
			listPerson.set(index,nouvadress );
			return "adresse modifier !";
			
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
			
		}
		
	*/
	
	
}
