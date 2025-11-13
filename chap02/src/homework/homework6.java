package homework;

import java.util.Scanner;

public class homework6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 자리 숫자를 입력하세요: ");
        char char1 = sc.nextLine().charAt(0);

        int num = char1-'0';
        int result = num*num;

		System.out.printf("입력한 숫자의 제곱은 %d입니다.", result);
		
		
		
	}

}
