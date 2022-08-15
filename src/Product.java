import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// reading data
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This program displays the sign of a number given by the user!");
		System.out.print("Type in the first  number: ");
		double n = keyboard.nextDouble();
		System.out.print("Type in the second  number: ");
		double m = keyboard.nextDouble();

		if (n == 0 || m==0 ){
			System.out.println("The product is nil");
		}else {
			if ((n > 0 && m>0) || (n<0 && m<0) ){
				System.out.println("The product is positive");
			} else {
				System.out.println("The product is negative ");
			}
		}
		keyboard.close(); 
	}

}
