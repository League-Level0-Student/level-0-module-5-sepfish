import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String primeQ = JOptionPane.showInputDialog("Input a integer:");
		double primeOrNot = Double.parseDouble(primeQ);
		boolean divisible = false;
		for (int i = 2; i <= Math.sqrt(primeOrNot); i++) {
			if (primeOrNot % i == 0) {
				divisible = true;
			}
		}
		if (divisible == true) {
			JOptionPane.showMessageDialog(null, "The integer " + primeOrNot + " is not prime.");
		} else {
			JOptionPane.showMessageDialog(null, "The integer " + primeOrNot + " is prime.");
		}
}
}
