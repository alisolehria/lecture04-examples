import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {
		// reading data
		System.out.println("This program searches for the minimum of a list of numbers given by the user!");
		Scanner keyboard = new Scanner(System.in);
		
        double r;
        double small =0;
        System.out.print("Enter the number of items to compare ? ");
        int n = keyboard.nextInt();
        for(int i = 0; i<n; i++){
            System.out.print("Enter number " + (i+1) + "? ");
            r = keyboard.nextDouble();
            if(i==0){
                small = r;
            }else{
                 if( small > r){
                    small = r;
                }               
            }
            System.out.println("Up to now the minimum is " + small );
        }
        System.out.println("The smallest number you typed in is " + small );

        keyboard.close();
	}

}
