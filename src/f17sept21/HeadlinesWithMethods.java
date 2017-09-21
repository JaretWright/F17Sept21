package f17sept21;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class HeadlinesWithMethods {
    public static void main(String[] args)
    {
        String name = "Alex";
        System.out.printf("The world news headline is: %s", getHeadline(name));
        System.out.printf("The sports headline is: %s", getHeadline("sports"));
        System.out.printf("The politcs headline is: %s", getHeadline("politics"));
        System.out.printf("The weather headline is: %s", getHeadline("weather"));
    }
    
    public static String getHeadline(String subject)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("%n%nEnter the %s headlines: ", subject);
        String headline = keyboard.nextLine();
        return headline;
    }
}

