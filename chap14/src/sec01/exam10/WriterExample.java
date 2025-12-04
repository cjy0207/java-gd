package sec01.exam10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {

		try (Writer writer = new FileWriter("/Users/choejiyun/Desktop/workspace/test10.txt");) {

			//Writer는 문자열을 좀 더 쉽게 출력하기 위해서 writer(String str) 메소드 제공
			String str = "String TEST";
			
			writer.write(str);

			writer.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
