import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		// reading data
		System.out.println("This program searches for the maximum of 5  numbers given by the user!");

		Scanner keyboard = new Scanner(System.in);

		double r;
		double max = Double.MIN_VALUE;
		for (int i = 0; i < 5; i++) {
			System.out.print("Type the number " + (i + 1) + " : ");
			r = keyboard.nextDouble();
			if (r > max) {
				max = r;
			}
			System.out.println("Up to now the max is " + max);
		}
		System.out.println("The largest number you typed is " + max);
		keyboard.close();
	}

}
