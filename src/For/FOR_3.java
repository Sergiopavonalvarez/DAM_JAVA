package For;

public class FOR_3 {

	public static void main(String[] args) {
		int n = 99;

		int n3 = 0;
		int n4 = 0;
		

		for (int i = 0; i <= 100; i++) {

			n++;

			if (n % 2 == 0) {

				n3 = n3 + n;
				
			} else {

				n4 = n4 + n;
				
			}

		}
		System.out.println(n4);
		System.out.println(n3);

	}

}
