package homework.homework03;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        // 1. concatStrings
        System.out.print("합칠 문자열 입력 (1) : ");
        String str1 = sc.nextLine();

        System.out.print("합칠 문자열 입력 (2) : ");
        String str2 = sc.nextLine();

        String result1 = lib.concatStrings(str1, str2);
        System.out.println("결과: " + result1);

        // 2. multiply
        System.out.print("첫 번째 정수 : ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수 : ");
        int num2 = sc.nextInt();

        int result2 = lib.multiply(num1, num2);
        System.out.println("결과: " + result2);

        sc.nextLine(); 

        // 3. isEqual
        System.out.print("첫 번째 문자열 : ");
        String str3 = sc.nextLine();

        System.out.print("두 번째 문자열 : ");
        String str4 = sc.nextLine();

        boolean result3 = lib.isEqual(str3, str4);
        System.out.println("결과: " + result3);
    }
}