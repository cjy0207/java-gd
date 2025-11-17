package sec02.ex3;

public class Ex3 {

	public static void main(String[] args) {
		
		while(true) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			
			if(num1 + num2 == 5) {
				System.out.println(num1 + "+" + num2 +" = "+ (num1+num2) + " : 종료");
				break;
			}
			else {
				System.out.println(num1 + "+" + num2 +" = "+ (num1+num2) + " : 계속");
				continue;
			}
		}
		
		

	}

}
