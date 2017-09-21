package f17sept21;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class F17Sept21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("Please enter a number for assessment: ");
        Scanner keyboard = new Scanner(System.in);
        
        int userNum = keyboard.nextInt();
        
        if (userNum < 10)
            System.out.println("that is a small number");
        else 
            System.out.println("that is a nice number");
    }
    
}
