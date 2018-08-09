package nested_loops;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		//SINGLE FOR-LOOPS
		//1. Display all numbers from 1 to 100
		
		//for (int a = 1; a <= 100; a++) {
			//System.out.print(a + " ");
		//}
		
		//2. Display all numbers from 100 to 0 (also the bonus)
		
		//for (int b = 0; b <= 100; b++) {
			//System.out.print((100 - b) + " ");
		//}
		
		//3. Display all even numbers from 2 to 100
		
		//for (int c = 2; c <= 100; c += 2) {
			//System.out.print(c + " ");
		//}
		
		//4. Display all odd numbers from 1 to 99
		
		//for (int d = 2; d <= 100; d += 2) {
			//System.out.print((d - 1) + " ");
		//}
		
		//5. Display all numbers from 1 to 500. If the number is odd, print "odd" next to the number. If the number is even, print "even" next to the number.
		
		//for (int e = 1; e <= 500; e++) {
			//if (e % 2 == 0) {
				//System.out.println(e + " is even");
			//} else {
				//System.out.println(e + " is odd");
			//}
		//}
	
		//6. Display all multiples of 7 from 0 to 777.
		
		//for (int f = 0; f <= 777; f += 7) {
			//System.out.print(f + " ");
		//}
		
		//7. Print all the years you were alive and how old you were in each
		
		//for (int g = 0; g <= 14; g++) {
			//if (g == 1) {
				//System.out.println("In " + (2004 + g) + ", I was " + g + " year old.");
			//} else {
				//System.out.println("In " + (2004 + g) + ", I was " + g + " years old.");
			//}
		//}
		
		//NESTED FOR-LOOPS
		//1. Display the output 0 0  0 1  0 2  1 0  1 1  1 2  2 0  2 1  2 2
		
		//for (int h = 0; h < 3; h++) {
			//for (int i = 0; i < 3; i++) {
				//System.out.println(h + " " + i);
			//}
		//}
		
		//2. Display the numbers 1 through 9 in a 3x3 square grid
		//int hmm = 0;
		//for (int j = 1; j < 8; j += 3) {
			//for (int k = 0; k < 3; k++) {
				//hmm = (j + k);
				//System.out.print(hmm + " ");
			//}
			//System.out.println(" ");
		//}
		
		//3. Display the numbers 1 through 100 in a 10x10 square grid
		//int sum = 0;
		//for (int l = 1; l < 99; l += 10) {
			//for (int m = 0; m < 10; m++) {
				//sum = (l + m);
				//System.out.print(sum + " ");
				//}
			//System.out.println(" ");
		//}
		
		//4. Display a triangle of asterisks
		//for (int n = 0; n < 6; n++) {
			//for (int o = 0; o <= m; o++) {
				//System.out.print("* ");
			//}
			//System.out.println(" ");
		//}
	}

}
