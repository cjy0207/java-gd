package sec02.exam02;

public class ByteExample {

	public static void main(String[] args) {
		//byte(1byte)
		//값의 범위 : -128~127
		
		byte var1 = -128;
		byte var2 = 0;
		//byte var3 = 128; //범위를 벗어난 값을 저장하여고 하면 컴파일 에러 발
		
		System.out.println(var1);
		System.out.println(var2);
		//System.out.println(var3);
		
		//참고 : 실행 중에 값의 범위를 벗어난 경우 순환이 일어남
		byte var5 = 126;
		System.out.println(var5);
		var5++;
		System.out.println(var5);
		var5++;
		System.out.println(var5);
		var5++; //overflow
		
		byte var6 = -127;
		System.out.println(var6);
		var6--;
		System.out.println(var6);
		var6--;
		System.out.println(var6);
		var6--;
		
	}

}
