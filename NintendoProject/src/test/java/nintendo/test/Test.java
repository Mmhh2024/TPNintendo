package nintendo.test;

import java.time.LocalDate;
import java.util.Scanner;


import nintendo.model.Hybride;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Console;
import nintendo.model.Jeu;
import nintendo.model.Portable;

public class Test {

   


	public static int saisieInt(String message) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		int variable = sc.nextInt();
		return variable;
	}

	public static double saisieDouble(String message) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextDouble();
	}

	public static String saisieString(String message) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextLine();
	}
	
	public static void main(String[] args) {
		

		 Console c1 = new Portable("GameBoy",150.0,LocalDate.now());
		 Jeu j1 = new Jeu("Mario",c1,null);
		 Jeu j2 = new Jeu("Foot",c1,null);

		 


		Adresse adresse = new Adresse(12, "rue des Tulipes", "Paris");
		Boutique b1 = new Boutique("Magic", adresse);
	}

}
