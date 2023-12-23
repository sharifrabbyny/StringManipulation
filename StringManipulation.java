package finals;

import java.util.Scanner;
public class StringManipulation {
   
	public static void main(String [] args){
		manipulateString();
	}
   public static void manipulateString() {
    	
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a sentence");
        
        String input = scnr.nextLine();

        String[] w = input.split(" ");
        String x = "";

        for (int i = w.length - 1; i >= 0; i--) {
        	
            if (i % 2 == 0) {
            	
                x += w[i].toUpperCase() + " ";
                
            } else {
            	
              x +=  w[i].toLowerCase() + " ";
            }
        }
        System.out.print(x.stripTrailing());

    }

}