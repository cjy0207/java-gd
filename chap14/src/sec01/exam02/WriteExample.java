package sec01.exam02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		
		try(OutputStream os = new FileOutputStream("/Users/choejiyun/Desktop/workspace/test2.txt")) {
			
			//배열에 바이트 데이터를 담아서 한꺼번에 출력하면 훨씬 빠르게 출력
			//출력할 바이트 배열
			byte[] arr = {10, 20, 30};
			
			//배열의 모든 바이트를 출력
			os.write(arr);
			
			os.flush();
			System.out.println("저장완료");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
