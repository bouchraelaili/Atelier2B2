package Exercice3;

public class CompteBancaire {


	protected int numerocmpt;
	protected double solde;
	public double montant;
	public  double retraitSolde;
	
	
	public CompteBancaire(int numerocmpt, double solde) {
		super();
		this.numerocmpt = numerocmpt;
		this.solde = solde;
	}
	
	public CompteBancaire() {
		
	}
	public double Ajouter(double montant) {
		 
	            return solde = montant+solde;
	        }
	         
	
	
	public double Retirer(double montant) {
		if (solde<200) {
			System.out.println("vous avez moins de 200, vous ne pouvez pas retirer");
		}
		else {
			retraitSolde = solde - montant;
		
		}
		 return retraitSolde;
	}
	
	
	public void Afficher() {
		
			
			 System.out.println("votre  numéro du compte est : " +numerocmpt +" et votre solde est:  "+ solde +"Dh" );

		}

	

		



}
	


	
	

