package homework_array;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int length;

		while (true) {
			System.out.print("정수 : ");
			length = sc.nextInt();
			if (length % 2 != 1 || length < 3) {
				System.out.println("다시 입력하세요.");
				continue;
			} else
				break;
		}

		int middle = length / 2;

		int[] a = new int[length];

		for (int i = 0; i < a.length; i++) {
			if (i <= middle)
				a[i] = i + 1;
			else a[i] = a[i-1] -1;
			System.out.print(a[i] + ", ");
		}

	}

}
