package homework;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("트리 높이를 입력하세요: ");
        int height = sc.nextInt();

        for (int i=1; i <=height; i++) {

            for (int j=1; j <=height -i; j++) {
                System.out.print(" ");
            }
            for (int k =1; k <= 2*i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}