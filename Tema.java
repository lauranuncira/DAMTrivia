package trivial.tematica;

import java.util.Scanner;

public class Tema {
	
	public static void main(String[] args)
	{
	//Creem una matriu anomenada "tabla" per a asignar espais on guardarem els valors de les preguntes i les respostes.
	int[][] tabla = new int[3][2];
	//Donem valors a cada espai de la matriu.FER-HO AMB STRINGS!!!!
	tabla[0][0] = 2;
	tabla[0][1] = 4;
	tabla[0][2] = 4;
	tabla[1][0] = 6;
	tabla[1][1] = 6;
	tabla[1][2] = 9;
	tabla[2][0] = 8;
	tabla[2][1] = 10;
	tabla[2][2] = 12;
	tabla[3][0] = 12;
	tabla[3][1] = 12;
	tabla[3][2] = 12;
	}
	public static void deportes()
		
	  {
			System.out.println("Has elegido deportes!");
	  }
		
	public static void ciencias()
	
	  {
			System.out.println("Has elegido ciencias!");
	  }
	
	public static void geografia()
	
	  {
			System.out.println("Has elegido geografia!");
	  }	
}

