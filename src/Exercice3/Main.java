package Exercice3;

public class Main {


	public static void main(String[] args) {
		CompteBancaire c1=new CompteBancaire();
		c1.numerocmpt=299229992;
		c1.solde=100;
		c1.Afficher();
		System.out.println("votre solde apres que vous avez ajouter" +c1.Ajouter(10));
		System.out.println("votre solde apres que vous avez retirer"+c1.Retirer(300));
		
		
		CompteEpargne c2=new CompteEpargne();
		c2.numerocmpt=492828479;
		c2.solde=300;
		c2.Afficher();
		System.out.println("votre solde apres que vous avez ajouter" +c2.Ajouter(10));
		System.out.println("votre solde apres que vous avez retirer"+c2.Retirer(300));
		System.out.println("Interet : "+c2.CalculInteret(0.01));

        
        
	}

}
