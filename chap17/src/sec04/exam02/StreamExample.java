package sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		String[] strArr = {"홍길동", "김재현", "김미나"};
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(item -> System.out.print(item + ", "));
		System.out.println();
		
		//다른 방법 참고
		Stream<String> strStream2 = Stream.of(strArr);
		strStream2.forEach(item -> System.out.print(item + ", "));
		System.out.println();
		
		int[] intArr = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArr);
		intStream.forEach(item -> System.out.print(item + ", "));
		System.out.println();
		
		//다른 방법 주의
//		Stream<int[]> intStream2 = Stream.of(intArr); //실수하면 배열자체가 아니라 하나의 요소로 흘러가는 스트림이 되어버림
//		Stream<Integer> intStream2 = Stream.of(1,2,3,4,5);
		IntStream intStream2 = IntStream.of(intArr);
		intStream2.forEach(item -> System.out.print(item + ", "));
		System.out.println();

	}

}
