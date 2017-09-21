
package f17sept21;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class CalorieCounter {
    public static void main(String[] args)
    {
        boolean keepAsking = true;
        Scanner keyboard = new Scanner(System.in);
        
        while (keepAsking)
        {
            System.out.printf("Enter a number and I'll tell you the calories%n1");
            System.out.printf("1. Chocolate Donut%n");
            System.out.printf("2. Banana Muffin %n");
            System.out.printf("3. Can of coke %n");
            System.out.printf("4. Quit the program%n?");
            
            int response = keyboard.nextInt();
            
            //decide if we have a valid input
            if (response >= 1 && response <= 3)
                System.out.printf("The calories are: %d%n%n", getCalories(response));
            else if (response == 4)
                keepAsking = false;  // this will stop the while loop
            else
                System.out.printf("Numbers entered must be 1-4%n");
        }   //end of while loop
    }   //end of main method
    
    public static int getCalories(int foodChoice)
    {
        if (foodChoice == 1) //a chocolate donut
            return 340;
        
        if (foodChoice == 2) //a banana muffin
            return 390;
        
        if (foodChoice == 3) //a can of coke
            return 140;
        else
            return -1;
    }
}   // end of the class
