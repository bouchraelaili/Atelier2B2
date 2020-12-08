package Ecercice2;

public class Article {
	private String nom;
	private double prix;
	

	public Article() {
		
	}
	public Article(String nom , double prix) {
		this.nom = nom;
		this.prix=prix;
	}
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public String geNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	
	public void afficher() {
		System.out.println("le nom de l'article est "+ nom + " de prix " +prix +" DH \n");
	}
}

