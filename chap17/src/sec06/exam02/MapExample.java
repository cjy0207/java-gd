package sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {

	public static void main(String[] args) {
		
		int[] intArr = {1,2,3,4,5};
		IntStream intStream =  Arrays.stream(intArr);
//		intStream.mapToDouble(value -> value)
//			.forEach(value -> System.out.println(value));
		
		//간편화 메소드
		intStream.asDoubleStream()
		.forEach(d -> System.out.println(d));
		
		System.out.println();
		
		//스트림은 최종 처리 후에 재사용 안됨
		//새로운 스트림 생성
		intStream =  Arrays.stream(intArr);
		intStream.boxed() //Stream<Integer> 를 반환 = Integer 객체로 변환된 스트림
			.forEach(obj -> System.out.println(obj.intValue())); //unboxing
		
		
		
		
		
		
		
		
		

	}

}
