import java.util.Scanner;

public class Circuit {
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {

		int userChoice;
		int userInput;

		System.out.println("This program calculates series or parallel type of circuits based on user given inputs.\n");

		System.out.println("Which circuit type do you have?\n 1. Series 2. Parallel \n");
		userChoice = keyboard.nextInt();

		if (userChoice == 1) {
			System.out.println("You chose a series type of circuit.\n");
			System.out.println("How many circuits do you have?\n");
			userInput = keyboard.nextInt();
			System.out.printf("Total resistance of your series circuit is: %.2f" + " Ohms.", series(userInput));
		} else if (userChoice == 2) {
			System.out.println("You chose a parallel type of circuit.\n");
			System.out.println("How many circuits do you have?\n");
			userInput = keyboard.nextInt();
			System.out.printf("Total resistance of your parallel circuit is: %.2f" + " Ohms.", parallel(userInput));
		} else {
			System.out.println("Invalid choice. Please choose either 1 or 2.");
			main(args);
		}

		keyboard.close();
	}

	public static double series(int input) {
		double[] array = new double[input];
		double value;
		double value2 = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please give the value of " + (i + 1) + " circuit.");
			value = keyboard.nextDouble();
			array[i] = value;
		}
		for (int y = 0; y < array.length; y++) {
			value2 += array[y];
		}
		return value2;
	}

	public static double parallel(int input) {
		double[] array = new double[input];
		double value;
		double value2 = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please give the value of " + (i + 1) + " circuit.");
			value = keyboard.nextDouble();
			array[i] = 1 / value;
		}
		for (int y = 0; y < array.length; y++) {
			value2 += (array[y]);
		}
		value2 = 1 / value2;
		return value2;
	}
}
