
/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class GradeEvaluator
{
    public static void main(String[]args) 
    { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int grade = sc.nextInt();

        // Ternary operator
        String result = (grade >= 40) ? "Pass" : "Fail";

        // Output with escape sequences
        System.out.println("\n------ RESULT ------");
        System.out.println("Your grade is:\t" + grade);
        System.out.println("Status:\t\t" + result);
        System.out.println("---------------------\n");
        
    
    
    
    }
}