import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
          	skills.skill1();
          	skills.skill2();
          	skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
	String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
	int cents = Integer.parseInt(dimes);

// Tell them how many cents they have (hint multiply by 10)
	JOptionPane.showMessageDialog(null, "Hey, you have " + (cents*10) + " cents.");

// Ask the user how tall they are (inches)
	String height = JOptionPane.showInputDialog("How tall are you, in inches?");
	int inches = Integer.parseInt(height);

// If they are shorter than 36 inches, tell them to eat their Wheaties
	if (inches < 36) {
		JOptionPane.showMessageDialog(null, "Eat your Wheaties.");
	}
}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
	for (int i = 0; i < 30; i += 3) {
		System.out.print(i + " ");
	}
}

void skill3() { // Get a random number that is less than 20 and print it to the console 
	Random rand = new Random();
	int rand1 = rand.nextInt(20) + 1;
	System.out.println(rand1);

// Get another random number that is less than 10 and print it to the console 
	Random random = new Random();
	int randomInteger = random.nextInt(10) + 1;
	System.out.println(randomInteger);

// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
	JOptionPane.showMessageDialog(null, "The difference between the two random numbers is " + (rand1 - randomInteger), "yeet", JOptionPane.INFORMATION_MESSAGE);

}

void skill4() { // In a pop-up, ask the user for the city they live in 
	String home = JOptionPane.showInputDialog("What city do you live in?");


// If they answered "San Diego", tell them they live in America's Finest City 
	if (home.equalsIgnoreCase("San Diego")) {
		JOptionPane.showMessageDialog(null, "Yo, you live in America's Finest City!");
	} else {

// Otherwise, tell them to move to San Diego 
		JOptionPane.showMessageDialog(null, "I don't care about your city. Move to San Diego.", "alt text", JOptionPane.INFORMATION_MESSAGE);
	}

// Create a variable - cars - and initialize it to the number of cars your family has. 
	String isThisSupposedToBeThisWay = JOptionPane.showInputDialog("How many cars does your family have?");
	int cars = Integer.parseInt(isThisSupposedToBeThisWay);
		
// If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
	if (cars == 0) {
		JOptionPane.showMessageDialog(null, "I bet you use public transport", "or you live in Hong Kong", JOptionPane.INFORMATION_MESSAGE);
	} else

// If there is 1 car, use a pop-up to display the make/model of the car 
	if (cars == 1) {
		JOptionPane.showMessageDialog(null, "Well, the make and model of your car is obviously an FX35 Infiniti.");
	} else

// If there is more than 1 car, use a pop-up to display how many wheels the 
// cars have between them. 
	if (cars > 1) {
		JOptionPane.showMessageDialog(null, "Wow, your cars have " + (cars*4) + " wheels altogether!");
	}
}

void skill5() { // In a pop-up, ask the user for the name of their school 
	String school = JOptionPane.showInputDialog("What's the name of your school?");


// In another pop-up, tell the user, that their school is a fantastic school. 
// You must include the name of the school in the message.
	JOptionPane.showMessageDialog(null, school + " is a FANTASTIC SCHOOL.");



}
}
