package sec04.exam02;

import java.io.IOException;

public class KeycodeExample {
	public static void main(String[] args) throws IOException { //발생한 에외를 모니터에 출력하고 끝내라
		int KeyCode;
		
		//키보드로부터 키코드를 읽어올 때마다 예외가 발생할 수 있음 -> 예외처
		KeyCode = System.in.read(); //콘솔에서 키보드로부터 입력을 받을 때까지의 기다림. 입력이 없으면 멈춰있음
		System.out.println("KeyCode : " + KeyCode);
		
		KeyCode = System.in.read();
		System.out.println("KeyCode : " + KeyCode);
		
		KeyCode = System.in.read();
		System.out.println("KeyCode : " + KeyCode);
		
	
		
	}
}
