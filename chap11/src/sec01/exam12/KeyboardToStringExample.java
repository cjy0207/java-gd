package sec01.exam12;

import java.io.IOException;
import java.util.Scanner;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];

		// bytes 배얄에 키보드로부터 읽은 키코드 저장
		System.out.println("입력 : ");
		int readByteNo = System.in.read(bytes);
		// 입력 스트림에서 바이트들을 여러개 읽어 배열에 저장하고 읽은 바이트 수를 반환

		System.out.println(readByteNo); // 엔터도 포함되서 읽힘

//		String str = new String(bytes);
		String str = new String(bytes, 0, readByteNo - 2);// 필요한 부분만 문자열로(엔터 빼기
		System.out.println(str);

		// Scanner객체 사용
		// System.in.read()의 단점은 키코드를 하나씩 읽음
		// 이러한 단점을 보완하기 위해 자바는 Scanner 객체이용
//		Scanner sc = new Scanner(System.in);
//		System.out.println("스캐너 입력 : ");
//		String str2 = sc.nextLine();
//		System.out.println(str2);
//		sc.close();
		
		
		//참고 : try-with-resources
		//리소스를 자동으로 닫아주는 try문법
		//close()를 명시적으로 호출하지 않아도, try블록이 끝나거나 예외가 발생하는 예외가 발생하는 즉시 자동으로 자원 정리
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("스캐너 입력 : ");
			String str2 = sc.nextLine();
			System.out.println(str2);
		}
	}

}
