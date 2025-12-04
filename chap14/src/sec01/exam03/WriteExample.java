package sec01.exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		

		try(OutputStream os = new FileOutputStream("/Users/choejiyun/Desktop/workspace/test3.txt")) {
			
			//출력할 바이트 배열
			byte[] arr = {10, 20, 30, 40, 50};
			
			//바이트 데이터를배열로 출력시 출력 범위를 지정 가능
			//주어진 배열의 off번째 위치부터 len개 까지의 바이트를 출력
			os.write(arr, 1, 3);
			
			os.flush();
			System.out.println("저장완료");
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
