package sec04.exam04;

import java.io.IOException;

public class QStopExample {

	public static void main(String[] args) throws IOException {
		int KeyCode;

		while (true) {
			KeyCode = System.in.read();
			System.out.println("KeyCode: " + KeyCode);

			// 소문자q를 입력하면 종료 되도록
			if (KeyCode == 113)
				break;
		}

		System.out.println("종료");

	}

}
