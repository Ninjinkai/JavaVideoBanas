import java.util.Scanner;

public class JavaLessonTwo {
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Your favoirte number:");
		
		if (userInput.hasNextInt()) {
			int numberEntered = userInput.nextInt();
			System.out.println("You entered " + numberEntered);
			
			int numEntered2 = numberEntered * 2;
			System.out.println("Doubled: " + numEntered2);
		}
		else {
			System.out.println("Enter an integer.");
		}

	}

}
