import java.util.Scanner;

public class JavaLesson4 {

	public static void whileLoop() {
		int i = 1;
		
		while (i < 20) {
			if (i ==3) {
				i += 2;
				continue;
			}
			
			System.out.println(i);
			i++;
			
			if ((i % 2) == 0) {
				System.out.println(i + " is even.");
			}
			
			if (i > 10) {
				break;
			}
		}
	}
	
	public static void piCalc() {
		double myPi = 4.0;
		double j = 3.0;
		
		while (j < 1000) {
			myPi = myPi - (4/j) + (4/(j+2));
			j += 4;
			System.out.println(myPi);
		}
		
		System.out.println("pi = " + Math.PI);;
	}
	
	public static void stopLoop() {
		String contYorN = "Y";
		Scanner userInput = new Scanner(System.in);
		int h = 1;
		
		while (contYorN.equalsIgnoreCase("y")) {
			System.out.println(h);
			System.out.print("Continue y or n?");
			contYorN = userInput.nextLine();
			h++;
		}
		
		userInput.close();
	}
	
	public static void main(String[] args) {
		whileLoop();
		piCalc();
		stopLoop();
	}

}
