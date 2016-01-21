import java.util.Scanner;

public class JavaLessonFive {
	
	static double myPI = 3.1415926;
	static int randNum;
	static Scanner userInput = new Scanner(System.in);
	
	public static int addThem(int a, int b) {
		return a + b;
	}
	
	public static int getRandom() {
		return randNum = (int) (Math.random() * 51);
	}
	
	public static int checkGuess(int guess) {
		if (guess == randNum) {
			return -1;
		}
		else {
			return guess;
		}
	}

	public static void main(String[] args) {
		System.out.println(addThem(1, 2));
		
		System.out.println(getRandom());
		
		int guessResult = 1;
		int randomGuess = 0;
		
		while (guessResult != -1) {
			System.out.print("Guess a number: ");
			randomGuess = userInput.nextInt();
			guessResult = checkGuess(randomGuess);
		}
	}

}
