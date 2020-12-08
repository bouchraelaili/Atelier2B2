package test;

public class Employe {

	public String nom;
	public String prenom;
	public String adress;
	public int anneenaissance;
	public int anneeencours;
	



	public Employe() {
		
	}


public  int calculerAge() {
	
	
	 int age = 2020 - anneenaissance;
     return age;
}

public void afficherInfosClient() {
	 System.out.println(nom +" "+ prenom + " né le " +anneenaissance +" habitant à " + adress + ", " + calculerAge() + " ans."   );
}


}




