import java.util.Scanner;

public class Root {

	public static void main(String[] args) {
				//reading data
				System.out.println("This program computes the square root of a number given by the user!");
				
				//reading the number
				System.out.print("Type in a number? ");
				Scanner keyboard = new Scanner(System.in);
				double number = keyboard.nextDouble();
				
				//declaring a variable for the result;
				double root ;
				
				//performing the computation
				if(number >= 0) {//positive number
					root = Math.sqrt(number);
					System.out.print("Square root ("+ number+ ") = " + root);
				}else {//negative number
					System.out.print(number+ "does not have a 'real' square root ");
				}
				
				
				//closing the scanner
				keyboard.close();
	}

}
