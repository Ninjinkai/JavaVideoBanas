import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class JavaLessonEleven {

	public static void main(String[] args) {
		ArrayList arrayListOne;
		arrayListOne = new ArrayList();
		ArrayList arrayListTwo = new ArrayList();

		ArrayList<String> names = new ArrayList<String>();
		names.add("John Smith");
		names.add("Tim");
		names.add("Jane");
		names.add(2, "Killer");
		for (int i = 0 ; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		names.set(2, "Mary");
		for (int i = 0 ; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		Object[] moreNames = new Object[4];
		moreNames = names.toArray();
		System.out.println(Arrays.toString(moreNames));
	}

}
