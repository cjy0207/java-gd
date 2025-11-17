package homework_array;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String[] choices = {"가위", "바위", "보"};
		
		int round =0;
		int win = 0;
        int lose = 0;
        int tie = 0;

        while(true) {
            System.out.print("가위바위보 : ");
            String my = sc.nextLine();

            if(my.equals("stop")) break;
            else if(!(my.equals("가위") || my.equals("바위") || my.equals("보"))) {
            	System.out.println("잘못입력했습니다.");
            	continue;
            }
            
            int index = (int)(Math.random() * 3);
            String com = choices[index];
            
            round++;
            
            System.out.println("컴퓨터: " + com);
            System.out.println("나 : " + my);

            if(my.equals(com)) {
                System.out.println("비김");
                tie++;
            } 
            else if(
                (my.equals("가위") && com.equals("보")) ||
                (my.equals("바위") && com.equals("가위")) ||
                (my.equals("보") && com.equals("바위"))
            ) {
                System.out.println("이김");
                win++;
            } 
            else {
                System.out.println("짐");
                lose++;
            }

        }

        System.out.println(round+"전 "+win + "승" + lose + "무 " + tie + "패");
    }
}


