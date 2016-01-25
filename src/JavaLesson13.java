import java.util.Arrays;

public class JavaLesson13 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Random words and letters.");
		System.out.println(sb);
		
		sb.append(" Moar.");
		System.out.println(sb);
		
		sb.delete(6, 12);
		System.out.println(sb);

		System.out.println("sb capacity: " + sb.capacity());
		sb.ensureCapacity(64);
		System.out.println("sb capacity: " + sb.capacity());
		sb.trimToSize();
		System.out.println("sb capacity: " + sb.capacity());
		
	}

}