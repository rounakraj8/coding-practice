package numbers;

public class ReplaceAllZeroWithFive {

	public static void main(String[] args) {

		System.out.println(replace0With5(1020));

	}

	public static int replace0With5(int num) {

		int newNum = 0;
		int ten = 1;

		while (num != 0) {

			newNum = (num % 10 == 0 ? 5 : num % 10) * ten + newNum;

			ten *= 10;
			num /= 10;
		}
		return newNum;
	}

}
