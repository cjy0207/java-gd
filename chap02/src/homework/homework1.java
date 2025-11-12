package homework;

import java.util.Scanner;

public class homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float kg = sc.nextFloat();
		float m = sc.nextFloat();
		float BMI = kg / (m*m);
		
		System.out.printf("BMI지수: %.2f", BMI);
	}
}
