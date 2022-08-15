import java.util.Random;

public class NestedIf {

	public static void main(String[] args) {
		System.out.println("This program generates an alphabetcial letter randomly "
				+ "and tells if it is vowel or consonant!\n\n");
		
		//creating a random generator
		Random generator = new Random();
		//generating a number
        int n = 65 + generator.nextInt(58);
        char c = (char) n; //casting the number to char
        
        
        //checking the nature of the generated character
        if (n >= 65 && n <= 90) {
            if (n == 'A' || n == 'E' || n == 'I' || n == 'U' || n == 'O' || n == 'Y') {
            	System.out.println("The character " + c + " (code " + n + ") is a Upper case vowel");
            } else {
                System.out.println("The character " + c + " (code " + n + ") is a Upper case consonant");
            }
        } else {
            if (n > 90 && n < 97) {
                System.out.println("The character " + c + " (code " + n + ") is not alphabetical");
            } else {
                if (n == 'a' || n == 'e' || n == 'i' || n == 'u' || n == 'o' || n == 'y') {
                    System.out.println("The character " + c + " (code " + n + ") is a Lower case vowel");
                } else {
                    System.out.println("The character " + c + " (code " + n + ") is a Lower case consonant");

                }
            }
        }


	}

}
