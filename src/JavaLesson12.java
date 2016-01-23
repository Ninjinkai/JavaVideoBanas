import java.util.Arrays;
import java.util.LinkedList;

public class JavaLesson12 {

	public static void main(String[] args) {
		LinkedList llOne = new LinkedList();
		LinkedList<String> names = new LinkedList<String>();
		names.add("John");
		names.add("Tim");
		for (String name : names) {
			System.out.println(name);
		}

		LinkedList<String> nameCopy = new LinkedList<String>(names);
		nameCopy.push("Nick");
		System.out.println("nameCopy = " + nameCopy.toString());
	}

}
