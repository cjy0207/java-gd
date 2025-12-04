package sec01.exam13.quiz;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Quiz2 {
//	Quiz
//	"자바 프로그래밍입니다."가 저장된 "C:/Temp/test.txt" 파일을 
//	"C:/Temp/test_copy.txt" 로 복사하는 코드를 구현해 보세요.

//	힌트: Reader를 사용해 원본 파일에서 읽어온 데이터를 Writer를 사용해 타겟 파일로 바로 출력

	public static void main(String[] args) {

		try (Reader reader = new FileReader("/Users/choejiyun/Desktop/workspace/test.txt");
				 Writer writer = new FileWriter("/Users/choejiyun/Desktop/workspace/test_copy.txt")) {
			
			char[] buffer = new char[100];
			int readCharNum = reader.read(buffer);
			
			if (readCharNum != -1) {
				writer.write(buffer, 0, readCharNum);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//이미지 파일이 같은 바이너리 파일 복사는 바이트 기반 입출력 스트립을 사용하면 됨

	}

}
