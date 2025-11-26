package week4;
import java.util.Scanner;


/**
 * Write a description of class CalculatorUsingSwitch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculatorUsingSwitch
{
   public static void main(String[]arg)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first Number");
       int firstNumber=sc.nextInt();
       System.out.print("Enter the second Number");
       int secondNumber=sc.nextInt();
       System.out.println("Enter the operator as + - * / %");
       char operator=sc.next().charAt(0);
       switch(operator)
       {
         case '+' : System.out.println("add is"+(firstNumber+secondNumber));
                    break;
        case '-' : System.out.println("sub is"+(firstNumber-secondNumber));
                    break;
        case '/' : System.out.println("sub is"+(firstNumber/secondNumber));
                    break;
        case '*' : System.out.println("sub is"+(firstNumber*secondNumber));
                    break;
        default:
                System.out.println("Invalid operator");  
       }
   }
}