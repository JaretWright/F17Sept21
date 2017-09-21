package f17sept21;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class Headlines {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the world news headlines: ");
        String headline = keyboard.nextLine();
        System.out.printf("The world news headline is: %s", headline);

        System.out.printf("%n%nEnter the sports headlines: ");
        headline = keyboard.nextLine();
        System.out.printf("The sports headline is: %s", headline);

        System.out.printf("%n%nEnter the politics headlines: ");
        headline = keyboard.nextLine();
        System.out.printf("The politics headline is: %s", headline);

        System.out.printf("%n%nEnter the weather headlines: ");
        headline = keyboard.nextLine();
        System.out.printf("The weather headline is: %s", headline);

    }
}
