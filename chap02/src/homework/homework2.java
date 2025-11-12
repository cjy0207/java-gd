package homework;

import java.util.Scanner;

public class homework2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float w = sc.nextFloat();
		float h= sc.nextFloat();
		float area = w * h;
		float perimeter = (w+h)*2;
		
		System.out.printf("면적 : %.2f\n둘레 : %.1f", area, perimeter);
		
	}
}
