package l�xor;

public class uppgift5 {
   
	public static void main(String[] args){
        System.out.println("Ett program som med hj�lp av loopar skriver ut ett pyramid m�nster.");
        for(int i = 1; i<5; i++)
{
        	
        	// Skapa en tom string i antal mellanrum och byt sedan ut dom mot X
            System.out.println(String.format("%1$"+i+ "s", "X").replace(" ", "X"));
        }
    }
}
