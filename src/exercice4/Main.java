package exercice4;

//import java.util.ArrayList;
//import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Secretaire> listPerson = new ArrayList<Secretaire>();
		Enseignant ens1 = new Enseignant();
		ens1.setNom("laili");
		ens1.setPrenom("bouchra");
		ens1.setVille("safi");
		ens1.setDateNaissance(1998);
		ens1.setAdresse("tanger");
		ens1.specialie="develop";
		
        System.out.println(ens1.toString());
       
        Etudiant et = new Etudiant();
        et.setNom("amir");
        et.setPrenom("khadija");
        et.setVille("casa");
        et.setDateNaissance(1995);
        et.setAdresse("Casa598");
        et.diplome="math";
		
        System.out.println(et.toString());
       
        Secretaire sec1 = new Secretaire();
		sec1.setNom("laili");
		sec1.setPrenom("bouchra");
		sec1.setVille("safi");
		sec1.setDateNaissance(1998);
		sec1.setAdresse("tanger");
		sec1.numeroBureau=23;
		
        System.out.println(sec1.toString());
       

		

	}

}
