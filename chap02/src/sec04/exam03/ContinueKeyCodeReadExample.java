package sec04.exam03;

import java.io.IOException;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws IOException {
		int KeyCode;
		
		while(true) {
			KeyCode = System.in.read();
			System.out.println("KeyCode: "+KeyCode);
		}
	}

}
