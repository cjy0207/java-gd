package homework.homework3;

import java.util.Scanner;

public class CharacterMenu {
	
	public void menu() {
		
        Scanner sc = new Scanner(System.in);
        CharacterController cc = new CharacterController();

        System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine();

        try {
            int count = cc.countAlpha(str);
            System.out.println("영문자 개수: " + count);

        } catch (CharCheckException e) {
        	e.printStackTrace();
        }
	}

}
