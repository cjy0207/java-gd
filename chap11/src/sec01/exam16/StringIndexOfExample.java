package sec01.exam16;

public class StringIndexOfExample {

	public static void main(String[] args) {
		
		String subject = "java programming";
		String subject2 = "java project java wep";
		
		int location = subject.indexOf("programming");
		System.out.println(location);
		System.out.println(subject.indexOf("java"));
		System.out.println(subject.indexOf("java",2));
		System.out.println(subject.indexOf("java",20));
		
		
		if(subject.indexOf("java") != -1) System.out.println("관련 책");
		else System.out.println("관련 책 아님");
		
		
		//참고 : 문자열 포함 여부를 알려주는 메소드
		if(subject.contains("java")) System.out.println("관련 책");
		else System.out.println("관련 책 아님");

	}

}
