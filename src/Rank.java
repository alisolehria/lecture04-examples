import java.util.Scanner;

public class Rank {

	public static void main(String[] args) {
		// reading data
		System.out.println("This program checks the parity of a number!");
		System.out.print("Type in a number? ");
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();

		if (n < 0) {
			System.out.println("A negative number has no rank!");
		} else {
			String rank = "";
			int tens = n % 100;

			if (tens != 11 && tens != 12 && tens != 13) {
				int units = n % 10;
				switch (units) {
					case 1:
						rank = "st";
						break;
					case 2:
						rank = "nd";
						break;
					case 3:
						rank = "rd";
						break;
					default:
						rank = "th";
				}
			}
			System.out.println(n + rank);
		}
		keyboard.close();

	}

}
