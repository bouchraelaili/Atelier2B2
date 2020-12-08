package test;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employe emp1 = new Employe();
	        emp1.nom = "bouchra";
	        emp1.prenom = "laili";
	        emp1.adress = "Safi";

	        emp1.anneenaissance = 1998;

	        emp1.afficherInfosClient();	
	        
	        
	        Employe emp2 = new Employe();
	        emp2.nom = "laila";
	        emp2.prenom = "laili";
	        emp2.adress = "casa";

	        emp2.anneenaissance = 2000;

	        emp2.afficherInfosClient();		
		
	}

}
