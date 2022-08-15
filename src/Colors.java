
public class Colors {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			String color = "blue";
			switch (i % 3) {
				case 0:
					color = "red";
					break;
				case 1:
					color = "green";
					break;
				case 2:
					color = "blue";
			}
			System.out.println("Color : " + color );

		}

	}
}
