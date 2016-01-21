import java.util.*;
import java.io.*;

public class JavaLessonSix {

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		divideByZero(2);
		
		System.out.println("How old are you?");
		int age = checkValidAge();
		System.out.println("You are " + age);

		getAFile("./somestuff.txt");
		
		try {
			getAnotherFile("./someotherstuff.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Caught: " + e.getMessage());
			e.printStackTrace();
		}
		
	}

	private static void getAnotherFile(String fileName) throws FileNotFoundException {
		FileInputStream name = new FileInputStream(fileName);
		
	}

	private static void getAFile(String fileName) {
		try {
			FileInputStream file = new FileInputStream(fileName);
		}
		catch (FileNotFoundException e) {
			System.out.println("Caught: " + e.getMessage());
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Caught: " + e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("Done.");
		}
		
	}

	private static int checkValidAge() {
		try {
			return userInput.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("Caught: " + e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	private static void divideByZero(int i) {
		try {
			System.out.println(i/0);
		}
		catch (ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println("Caught exception.");
			e.printStackTrace();
		}
//		i /= 0;
	}

}
