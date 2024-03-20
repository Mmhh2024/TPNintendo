package nintendo.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import nintendo.model.Achat;
import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Jeu;
import nintendo.model.Portable;


public class Test {

	public static void main(String[] args) {
		Client c1=new Client("SAMY", "MA");
		Client c2=new Client("DUPOND", "JO");
		Adresse adresse = new Adresse(12, "rue des Tulipes", "Paris"); 
		Boutique b1 = new Boutique("Magic", adresse); 
				 
 
		 Portable p1 = new Portable("GameBoy",150.0,LocalDate.now()); 
		 Jeu j1 = new Jeu("Mario",p1,b1); 
		 Jeu j2 = new Jeu("Foot",p1,b1); 
 
 
 
		

		List<Achat> achat=new ArrayList();
		

		
	}

}
