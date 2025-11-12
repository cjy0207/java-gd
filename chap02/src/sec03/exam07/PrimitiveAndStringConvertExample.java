package sec03.exam07;

public class PrimitiveAndStringConvertExample {

	public static void main(String[] args) {
		int val1 = Integer.parseInt("10");
		double val2= Double.parseDouble("3.24");
		boolean val3 = Boolean.parseBoolean("true");
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		
		//System.out.println(Integer.parseInt("1a"));//숫자로 변환 불가능한 경우 예외 발생
		//System.out.println(Byte.parseByte("128")); // byte값의 범위를 벗어남
		
		// 기본타입 -> 문자열
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//참고 : 문자열로 변환하는 다른 방법
		String str = "" + 3;
		System.out.println(str);
				
	}

}
