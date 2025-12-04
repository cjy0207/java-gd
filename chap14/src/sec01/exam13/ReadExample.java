package sec01.exam13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("/Users/choejiyun/Desktop/workspace/test9.txt");

			char[] buffer = new char[100];

			// 입력스트림에서 3개의 문자를 읽고 인덱스 2부터 순차적으로 저장
			int readCharNum = reader.read(buffer, 2, 3);
			if (readCharNum != -1) {
				for (int i = 0; i < buffer.length; i++) {
					System.out.println(buffer[i]);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
