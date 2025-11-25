package homework.homework4;

import java.util.Scanner;

public class NumberMenu {
	
	public void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1 : ");
		int num1 = sc.nextInt();
		System.out.println("정수2 : ");
		int num2 = sc.nextInt();
		
		NumberController numctrl = new NumberController();
		try {
            boolean result = numctrl.checkDouble(num1, num2);
            System.out.println(num1 + "은(는) " + num2 + "의 배수인가? " + result);
        } catch (NumberRangeException e) {
        	e.printStackTrace();
        }
	}

}
