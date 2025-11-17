package homework_array;

import java.util.Scanner;
import java.util.Arrays;

public class Homework6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력: ");
        int length = sc.nextInt();

        String[] a = new String[length];
        
        
        sc.nextLine(); //엔터 비우기
        for (int i = 0; i < a.length; i++) {
            System.out.print((i + 1) + "번째 문자열 입력: ");
            a[i] = sc.nextLine();
        }

        while (true) {

            System.out.print("더 값을 입력하시겠습니까? (Y/N): ");
            String answer = sc.nextLine();

            if (answer.equals("N") || answer.equals("n")) {
                break;
            }
            else if (answer.equals("Y") || answer.equals("y")) {

                System.out.print("몇 개를 더 입력하시겠습니까?: ");
                int more = sc.nextInt();

                String[] newArr = new String[a.length + more];

                for (int i = 0; i < a.length; i++) {
                    newArr[i] = a[i];
                }
                
                sc.nextLine(); //엔터 비우기
                for (int i =a.length; i < newArr.length; i++) {
                    System.out.print((i + 1) + "번째 문자열 : ");
                    newArr[i] = sc.nextLine();
                }

                a = newArr;

            } 
            else System.out.println("입력할 수 없는 값입니다.");
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}