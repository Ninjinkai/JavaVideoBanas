import java.util.Scanner;

import com.sun.corba.se.spi.ior.iiop.GIOPVersion;

public class LessonThree {
	public static void compareNum(int randNum) {
		if (randNum < 25) {
			System.out.println("The random number is < 25.");
		}
		else if (randNum > 40) {
			System.out.println("The random number is > 40.");
		}
		else if (randNum != 40) {
			System.out.println("The random number is not = 40.");
		}
		else {
			System.out.println("Nothing found.");
		}
	}
	
	public static String giveGrade(char grade) {
		switch (grade) {
		case 'A':
			return "Great!";
		case 'B':
		case 'C':
			return "Good!";
		case 'D':
			return "Keep trying!";
		case 'F':
			return "Don't give up!";
		default:
			return "Not a valid grade.";
		}
	}

	public static void main(String[] args) {
		int randomNumber = (int) (Math.random() *50);
		compareNum(randomNumber);
		System.out.println("The random number is: " + randomNumber);
		
		System.out.println(giveGrade('B'));;
		
	}

}
