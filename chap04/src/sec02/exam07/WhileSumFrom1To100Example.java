package sec02.exam07;

import java.util.Scanner;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		int count =1;
		while(true) {
			System.out.println(count);
			if(count==6) break;
			count++;
		}
		
		count =1;
		boolean flag = true;
		
		while(flag) {
			System.out.println(count);
			if(count==6) flag=false; //flag값만 바꿔준거라 count++가 실행
			count++;
		}
		
		
		//do-while문
		//최소 한번은 실행하야하는 로직에 유용하지만, 실무에서는 거의 사용되지않음
		sum = 0;
		i =1;
		do {
			sum += i;
			i++;
		}while(i<=100);
		System.out.println(sum);
		
		
		// Quiz1: 1부터 100까지 홀수의 합
		
		i = 1;
		sum = 0;
		while(i<=100) {
			if(i%2==1) sum += i;
			i++;
		}
		System.out.println(sum);
		
		
		
				// Quiz2:
//				화면에서 자연수를 입력받아서 각 자리수의 합을 출력하는 프로그램을 구현하시오.
		//
//				[입력]    [출력]
//				 123   =>  6
//				 12345 =>  15
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		i=0;
		sum=0;
		while(i<str.length()) {
			sum += str.charAt(i) - '0';
			i++;
		}
		System.out.println(sum);
		
		
		//다른 방법
		int num = sc.nextInt();
		sum=0;
		while(num > 0) {
			sum += num%10; //마지막 자리수 더하
			num /= 10; // 마지막 자리 제거
			
		}
		System.out.println(sum);
	}

}
