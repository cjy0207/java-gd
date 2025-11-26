package sec01.exam20;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {

		String str1= "java Programming";
		String str2= "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		//대소문자상관 없이 비교
		
		//방법1
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
				
		System.out.println(lowerStr1);
		System.out.println(lowerStr2);
		System.out.println(lowerStr1.equals(lowerStr2));
		
		//방법2
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
