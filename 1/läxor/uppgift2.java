package l�xor;

import java.util.Scanner;

public class uppgift2 {

public static void main(String[] args){
	
	System.out.println("Skapa ett program som l�ser in textrader fr�n konsolen och avslutas n�r texten EXIT skrivs in.");
		
	System.out.println();
			
	System.out.println("Skriv in text: ");

			Scanner scanner = new Scanner(System.in);
		boolean running = true;
		while(running){
	
			//Ber�ttar att n�r "SLUTA" skrivs in s� tar den bort funktionen att skriva i konsolen
			String strIn = scanner.nextLine();
		if(strIn.equals("SLUTA")){
	running = false;
	
	scanner.close();
			}
		}
	}
}