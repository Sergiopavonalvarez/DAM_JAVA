package Arrays;

public class ARRAYS_3 {

	public static void main(String[] args) {

		ARRAYS_3 a = new ARRAYS_3();
		System.out.println(a.inReverse(new int[] { 1, 2, 3, 4, }));
	}

	public String inReverse(int[] values) {

		String message = "";

		for (int count = values.length - 1; count >= 0; count--) {

			if (count == values.length - 1) {

				message = message + values[count];

			} else
				message = message + "" + values[count];

		}

		return message;
	}
}
