package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		int value=123;
		System.out.printf("상품의 가격 : %d원\n", value);
		//공백문
		System.out.printf("상품의 가격 : %6d원\n", value); //앞
		System.out.printf("상품의 가격 : %-6d원\n", value); //뒤
		//공백문자 대신 0
		System.out.printf("상품의 가격 : %06d원\n", value);
		
		double area = 3.14159 * 10*10;
		System.out.printf("반지름이 %1$d인 원의 넚이 : %2$10.2f\n",10, area); // .2 :
		
		String name = "chio";
		String job = "pro";
		System.out.printf("%6d | %-11s|%11s\n", 1, name, job);
	}

}
