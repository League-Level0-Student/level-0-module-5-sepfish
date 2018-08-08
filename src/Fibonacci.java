
public class Fibonacci {
	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber = 1;
		System.out.print(firstNumber + ", ");
		System.out.print(secondNumber + ", ");
		for (int i = 0; i <= 10; i++) {
			int fibonacci = (firstNumber) + (secondNumber);
			System.out.print(fibonacci + ", ");
			firstNumber = secondNumber;
			secondNumber = fibonacci;
		}
	}
}
