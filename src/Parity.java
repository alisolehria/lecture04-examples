import java.util.Scanner;

public class Parity {

	public static void main(String[] args) {
		// reading data
		System.out.println("This program checks the parity of a number!\n");
		
		System.out.print("Type in a number? ");
		Scanner keyboard = new Scanner(System.in);
		int number = keyboard.nextInt();

		//checking the parity
		if (number % 2 == 0) {
			System.out.println(number + " is even");
		} else {
			System.out.println(number + " is odd");
		}
		keyboard.close();
	}

}
