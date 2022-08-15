import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
		// reading data
		System.out.println("This program displays the sign of a number given by the user!");
		System.out.print("Type in a number? ");
		Scanner keyboard = new Scanner(System.in);
		double number = keyboard.nextDouble();

		if (number > 0) {
			System.out.println(number + " : positive");
		} else {
			if (number == 0) {
				System.out.println(number + " : nil");
			} else {
				System.out.println(number + " : negative");
			}
		}
		keyboard.close();
	}

}
