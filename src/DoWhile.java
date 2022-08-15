import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		System.out.println("This program loops until the user types 0!");
		Scanner keyboard = new Scanner(System.in);
		
		
		int n;
		
		do {
			System.out.print("Type a number? ");
			n = keyboard.nextInt();
		}while(n != 0);
		
		System.out.println("Finished looping");
		keyboard.close();
	}

}
