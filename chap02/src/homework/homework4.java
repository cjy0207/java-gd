package homework;

import java.io.IOException;

public class homework4 {
	
	public static void main(String[] args) throws IOException {
		
		System.out.print("문자를 입력하세요: ");
        int KeyCode = System.in.read();
        System.out.printf("%c의 유니코드: %d%n", (char) KeyCode, KeyCode);
		
	}
	
}
