package Exercice3;

public class CompteEpargne extends CompteBancaire {

	public double interet;
	
	public CompteEpargne(int numerocmpt, double solde,double interet) {
		super(numerocmpt, solde);
		this.interet=interet;
	}
	
	
	
	public CompteEpargne() {
		
	}


	public double CalculInteret(double inter) {
		 return interet=(solde*inter)*12/12;
		 
	}
	

}
