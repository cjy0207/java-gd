package sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("this is java");
		list1.add("i am a best developer");
		list1.stream() //오리지널 스트림 : Stream<String> -? 문자열이 두개가 흘러감
			.flatMap(data -> Arrays.stream(data.split(" "))) //3개짜리 + 5개짜리 문자열이 흐르는 스트림
			.forEach(word -> System.out.println(word));
		
		System.out.println();
		
		//문자열 숫자 목록 스트림을 숫자 스트림으로 변환
		List<String> list2 = Arrays.asList("10, 20, 30, 40, 50");
		list2.stream() //2개의 문자열이 흘러감
			.flatMapToInt(data -> { //int 값으로 펼치겠다 "10,20, 30" -> 10, 20, 30
				String[] strArr = data.split(",");
				int[] intArr = new int[strArr.length];
				for (int i = 0; i < strArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr); //3개의 IntStream 리턴 + 2개의 IntStream 리턴
			})
			.forEach(number -> System.out.println(number));
		

	}

}
