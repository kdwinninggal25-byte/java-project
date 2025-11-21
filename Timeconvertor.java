
/**
 * Write a description of class Timeconvertor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Timeconvertor
{
   public static void main(String[]args)
   {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int totalSeconds = sc.nextInt();

        int hours = totalSeconds / 3600;
        int remaining = totalSeconds % 3600;

        int minutes = remaining / 60;
        int seconds = remaining % 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
   
   
   
    