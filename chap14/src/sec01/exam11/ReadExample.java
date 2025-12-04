package sec01.exam11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) {
		try (Reader reader = new FileReader("/Users/choejiyun/Desktop/workspace/test7.txt");) {

			//입력 스트립으로부터 한 문자씩 읽어오고
			//int(4byte) 타입으로 리턴
			while(true) {
				int data = reader.read();
				if(data == -1) break;
				System.out.println(data);
				//char타입으로 변환하면 문다를 얻을 수 있음
				System.out.println((char)data);
			}
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
