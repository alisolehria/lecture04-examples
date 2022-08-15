import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		System.out.println("This program loops until the user types 0!");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Type a number? ");
		int n = keyboard.nextInt();
		
		while(n != 0) {
			System.out.print("Type a number? ");
			n = keyboard.nextInt();
		}
		
		System.out.println("Finished looping");
		keyboard.close();
	}

}
