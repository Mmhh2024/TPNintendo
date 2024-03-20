package nintendo.test;


import java.util.Scanner;

import nintendo.model.Console;
import nintendo.model.Jeu;

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
		// TODO Auto-generated method stub
		
		 Console c1 = new Console("GameBoy");
		 Jeu j1 = new Jeu("Mario",c1);
		 Jeu j2 = new Jeu("Foot",c1);
		 
		 

	}

}
