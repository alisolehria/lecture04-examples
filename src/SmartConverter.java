import java.util.Scanner;

public class SmartConverter {

	public static void main(String[] args) {
		//reading data
		System.out.println("This program converts Celisus to Fahrenheit, and tells if the weather is cold or hot !!");
		
		System.out.print("What is the temperture in Celsius?");
		Scanner keyboard = new Scanner(System.in);
		float celsius = keyboard.nextFloat();
		
		//performing the conversion
		float fahrenheit = 9 * celsius / 5 + 32;
		
		//printing result
		System.out.println(celsius + " Celsius " + " = " + fahrenheit + " Fahrenheit");

		if(celsius > 20) {
			
			System.out.print("It is hot!");
			
		}else {
			
			System.out.print("It is cold!");
			
		}
		
		//closing the scanner
		keyboard.close();
	}

}
