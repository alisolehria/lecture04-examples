
public class LiveCoding {
	
	public void method1(int i, int j) {
		System.out.println(i + j);
	}
	
	public static void main(String[] args) {
//		print out numbers 1-10: 
//			1
//			2
//			3
//			4
//			5 ...
		for(int i = 1;i<=10;i=i+1) { // 2 4 
			if(i % 2 != 0){
				if(i == 5){
					break;
				}
				continue;
			}
	
			System.out.println(i);
		}
		System.out.println("for loop stopped");
		
		int i = 1;
		//boolean positive = true;
		while(i <= 10) {
			if(i % 2 != 0){
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("while loop stopped");
		
		i = 1;
		do {
			if(i % 2 != 0){
				i++;
				continue;
			}
			System.out.println(i);
			
			i++;
		}while(i<=10);
		System.out.println("do while loop stopped");
	}

}
