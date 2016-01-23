import java.util.Arrays;

public class JavaLessonNine {

	public static void drawLine() {
		System.out.println();
		int k = 1;
		while (k <= 61) {System.out.print('-'); k++;}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] randomArray;
		randomArray = new int[10];
		randomArray[1] = 2;
		for (int row : randomArray) {
			System.out.print(row + " ");
		}
		drawLine();
		
		String[] stringArray = {"zero", "one", "two"};
		for (String row : stringArray) {
			System.out.print(row + " ");
		}
		drawLine();
		
		int[] numberArray = new int[10];
		for (int i = 0; i < 10; i++) {
			numberArray[i] = i*2;
		}
		for (int row : numberArray) {
			System.out.print(row + " ");
		}
		drawLine();
		
		String[][] multiArray = new String[10][10];
		for (int i = 0; i < multiArray.length; i++) {
			for (int j = 0; j < multiArray[i].length; j++) {
				multiArray[i][j] = i + " " + j;
			}
		}
		for (int i = 0; i < multiArray.length; i++) {
			for (int j = 0; j < multiArray[i].length; j++) {
				System.out.print("| " + multiArray[i][j] + " ");
			}
			System.out.println("|");
		}
		drawLine();
		for (String[] rows : multiArray) {
			for (String col : rows) {
				System.out.print("| " + col + " ");
			}
			System.out.println("|");
		}
		drawLine();
		
		System.out.println(Arrays.toString(numberArray));
		System.out.println(Arrays.deepToString(multiArray));
	}

}
