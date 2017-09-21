package f17sept21;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class AverageGrade {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Enter a grade: ");
        int grade1 = keyboard.nextInt();
        
        System.out.printf("Enter a grade: ");
        int grade2 = keyboard.nextInt();
        
        System.out.printf("Enter a grade: ");
        int grade3 = keyboard.nextInt();
        
        double avg = getAverage(grade1, grade2, grade3);
        System.out.printf("The average is %.1f%% %n", avg);
    }
    
    
    public static double getAverage(int g1, int g2, int g3)
    {
        return (double) (g1+g2+g3)/3;
    }
}
