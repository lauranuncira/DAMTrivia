package trivial.menu;

import trivial.puntuacion.Ranking;
import trivial.tematica.Tema;

public class Menu {
	
	static java.util.Scanner lector = new java.util.Scanner(System.in);
	static int tema = -1;
	
	public static void main(String[] args) {
		
		//Mientras la opci�n elegida sea 0, preguntamos al usuario
		while(tema != 0){
		
		
				
				System.out.println("Elige uno de estos tres temas:\n1.- Deportes" +
						"\n2.- Ciencias\n" +
						"3.- Geogafia\n" +
						"4.- Ranking\n"+
						"0.- Salir");
				//Recoger una variable por consola
				tema = lector.nextInt();
				
				switch(tema){
				
				case 1:
					
					//LLamar a la funcion tematica
					Tema.deportes();
					break;
				case 2:
					
					//LLamar a la funcion tematica
					Tema.ciencias();
					break;
				case 3:
				
					//LLamar a la funcion tematica
					Tema.geografia();
					break;
				case 4:	
					
					//Ir al ranking
					Ranking.ranking();
					break;
				case 5:
					//Salir
					System.out.println("\nHasta pronto!");
				default:
			           System.out.println("error" );
			           break;	
					
				}
				
					
	}
}
}
