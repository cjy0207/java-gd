package sec03.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class GetLineStringFromKeyboard {
	
	public static void main(String[] args) throws IOException {
		InputStream is = System.in; //바이트 기반 입력 스트림
		Reader reader = new InputStreamReader(is); //문자 기반 Reader로 변환
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			System.out.println("입력하세요 : ");
			String lineStr = br.readLine();
			if("q".equals(lineStr) || "quit".equals(lineStr)) break;
			System.out.println("입력된 내용 : " + lineStr);
			
		}
		
		br.close();
	}

}
