package samplemaven;
import java.util.Scanner;

public class ArthmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        
		        // Create scanner class object
		        Scanner in = new Scanner(System.in);

		        // Input two numbers from user
		        System.out.print("Enter first number :");
		        int num1 = in.nextInt();
		        System.out.print("Enter second number :");
		        int num2 = in.nextInt();
		        

		        // Perform arithmetic operations.
		        int sum 		= num1 + num2;
		        int difference 	= num1 - num2;
		        int product 	= num1 * num2;
		        int quotient	= num1 / num2;
		        int modulo	    = num1 % num2;
		        

		        // Print result to console.
		        System.out.print("Sum : "         + sum);
		        System.out.print("Difference : "  + difference);
		        System.out.print("Product : "     + product);
		        System.out.print("Quotient : "    + quotient);
		        System.out.print("Modulo : "      + modulo);
		    }
		}

