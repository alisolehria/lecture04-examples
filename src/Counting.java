import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		// reading data
		System.out.println("This program counts to from n to n+10!");
		System.out.print("Type in the  number n ? ");
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();

		for (int i = n + 1; i <= n + 10; i++) {
			System.out.print(i + ", ");
		}
		keyboard.close();

	}

}
