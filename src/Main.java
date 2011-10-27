
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CustomString string1 = new CustomString();
		
		CustomString string2 = new CustomString();
		
		CustomString string3 = new CustomString();
		
		string1.text = "hola";

		string2 = string1;
		
		string3 = string1.clone();
		
		string1.text = "chau";
		
		System.out.println(string1.text);
		System.out.println(string2.text);
		System.out.println(string3.text);
		
	}

}
