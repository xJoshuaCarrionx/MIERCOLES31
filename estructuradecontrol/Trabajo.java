package estructuradecontrol;

import java.util.Scanner;

public class Trabajo { 
	
	public static void main(String[] args) {
		
		String Genero = null, masculino, femenino;
		int edad;
		boolean PortarArma = false;
		 
		
		Scanner G=new Scanner(System.in);
		
		System.out.println("Ingrese su genero(ingrese si es femenino o masculino)");
		Genero = G.toString(); 
		
		
		
		System.out.println("Ingrese su edad");
		edad = G.nextInt();
		
			
			System.out.println("Su edad es:" + edad);
			
		
		System.out.println("Usted porta un arma?");
		PortarArma = G.hasNext();
		
		
		if(edad > 18) {
		System.out.println("USTED PUEDE PASAR");
		
		}else if (edad < 18 && PortarArma);
		System.out.println("USTED NO PUEDE PASAR");

	}

}
