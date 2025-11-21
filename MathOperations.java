
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[]args) 
     { 
          int a = 10, b = 3;

        // Arithmetic operators
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        // Unary operators
        int x = +a;
        int y = -b;
        a++;  // increment
        b--;  // decrement

        // Relational operators
        boolean greater = a > b;
        boolean equal = a == b;
        
        // Logical operators
        boolean logicResult = (a > 5) && (b < 10);

        // Assignment operators
        int c = 5;
        c += 3; // now 8
        c *= 2; // now 16

        // Ternary operator
        String check = (a > b) ? "a is greater" : "b is greater";

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        System.out.println("Unary +a: " + x);
        System.out.println("Unary -b: " + y);
        System.out.println("Incremented a: " + a);
        System.out.println("Decremented b: " + b);

        System.out.println("a > b: " + greater);
        System.out.println("a == b: " + equal);
        System.out.println("Logical AND: " + logicResult);

        System.out.println("Assignment result c: " + c);

        System.out.println("Ternary check: " + check);
    }
}

