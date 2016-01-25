
public class JavaLesson14 {

	public static void main(String[] args) {
		Animals genAnimal = new Animals();
		Cats morris = new Cats("Morris", "Tuna", "Rubber mouse");
		
		acceptAnimal(morris);
		acceptAnimal(genAnimal);

	}
	
	public static void acceptAnimal(Animals randAnimal) {
		System.out.println(randAnimal.getName());
		System.out.println(randAnimal.favFood);
		randAnimal.walkAround();
		
		try {
			Cats tempCat = (Cats) randAnimal;
			System.out.println(tempCat.favToy);
		}
		catch (Exception e) {
			System.out.println("Caught " + e.toString());
			e.printStackTrace();
		}
	}

}
