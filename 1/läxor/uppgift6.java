package l�xor;

import java.util.Scanner;

public class uppgift6 {

    public static void main(String[] args){
        System.out.println("Ett program som skriver ut en pyramid efter att anv�ndaren matat in antal rader pyramidens bas ska vara.");
        System.out.println();
        System.out.print("Skriv in en bas: ");

        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();

        for(int i = 0; i<base; i++){
            for(int j = base - i; j>1; j--){ //Sriver ut antal mellanrum innan
                System.out.print(" ");
            }

            for(int j = 0; j <= i; j++){ //Skriver ut X tecken
                System.out.print("X ");
            }

            System.out.println(); //Skapar ny rad s� allt inte hamnar p� samma rad
        }
    }
}
