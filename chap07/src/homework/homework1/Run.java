package homework.homework1;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Student[] students = new Student[3];

        students[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
        students[2] = new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과");
        
        System.out.println("=== 학생 정보 ===");
        for (Student s : students) {
            System.out.println(s.toString());
        }
        
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[10];
        int count = 0;

        while (true) {
            System.out.println("=== 사원 입력 받기 ===");

            System.out.print("이름: ");
            String name = sc.next();

            System.out.print("나이: ");
            int age = sc.nextInt();

            System.out.print("키: ");
            double height = sc.nextDouble();

            System.out.print("몸무게: ");
            double weight = sc.nextDouble();

            System.out.print("급여: ");
            int salary = sc.nextInt();

            System.out.print("부서: ");
            String dept = sc.next();

            employees[count] = new Employee(name, age, height, weight, salary, dept);
            count++;

            System.out.print("계속 추가하시겠습니까? : ");
            String ans = sc.next();

            if (ans.equalsIgnoreCase("n")) break;
        }
        
        
        for (int i = 0; i < count; i++) {
            System.out.println("=== " + employees[i].name + " ===");
            System.out.println(employees[i].toString());
        }

	}

}
