
/**
 * Write a description of class Daysconvertor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Daysconvertor
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int remaining = totalDays % 365;

        int months = remaining / 30;
        int days = remaining % 30;

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }
}
    
    
