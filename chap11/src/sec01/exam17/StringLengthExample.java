package sec01.exam17;

public class StringLengthExample {

	public static void main(String[] args) {
		
		String ssn = "1234561234567"; //하이픈 없이
		
		int length = ssn.length();
		
		if(length ==13) System.out.println("right");
		else System.out.println("not ssn");
		

	}

}
