package homework.homework05;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.nextLine().trim();

        System.out.print("생년월일 : ");
        String birth = sc.nextLine().trim();

        char first = name.charAt(0);

        String restName = name.substring(1);

        String yearLast2 = birth.substring(2, 4);

        String day = birth.substring(6, 8); 
        
        String password = first + yearLast2 + day + restName;

        System.out.println("암호: " + password);
    }
}