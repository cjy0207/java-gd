package sec01.exam13;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char gender = ssn.charAt(7);
		
		switch (gender) {
		case '1':
		case '3':
			System.out.println("male");
			break;
		case '2':
		case '4':
			System.out.println("female");
			break;
		}
		
		switch(gender) {
		case '1', '3' -> System.out.println("male");
		case '2', '4' -> System.out.println("male");
		}

	}

}
