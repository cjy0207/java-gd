package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num;
		
		while(true) {
			System.out.print("정수(1-50) : ");
			num = sc.nextInt();
			if(num<50 && num >1) break;
			else System.out.println("1-50 사이의 정수를 립력하세요");
		}
		
		for(int i=1; i<=num; i++) {
			if(i%2==0) sum += i;
		}
		System.out.print(sum);
		
	}

}
