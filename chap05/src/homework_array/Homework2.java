package homework_array;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;

		System.out.print("정수 : ");
		int length = sc.nextInt();
		
		int[] a = new int[length];
		
		for(int i =0; i<a.length; i++) {
			System.out.print("배열" +i+"번째 인데스에 넣을 값 : ");
			a[i] = sc.nextInt();
		}
		
		for(int i =0; i<a.length; i++) {
			System.out.print(a[i] +" ");
			sum += a[i];
		}
		
		System.out.println();
		System.out.println("총합 : " +  sum);
		
		
	}

}
