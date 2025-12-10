package sec10.exam01;

import java.util.Arrays;

public class AggregateExample {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		//카운팅
		long count = Arrays.stream(arr)
			.filter(value -> value % 2  == 0)
			.count();
		System.out.println("2의 배수의 개수 : " + count);
		
		//총합
		long sum = Arrays.stream(arr)
				.filter(value -> value % 2  == 0)
				.sum();
		System.out.println("2의 배수의 합 : " + sum);
		
		//평균
		double avg = Arrays.stream(arr)
				.filter(value -> value % 2  == 0)
				.average()
				.getAsDouble();
		System.out.println("2의 배수의 평균 : " + avg);
		
		//최대값
		int max = Arrays.stream(arr)
			 .filter(value -> value % 2 == 0)
			 .max()
			 .getAsInt();
		System.out.println("최대값 : " + max);
		
		
		//첫번쨰 요소
		int first = Arrays.stream(arr)
				 .filter(value -> value % 3 == 0)
				 .findFirst() //스트림의 첫번째 요소 (보통 filter랑 같이 사용)
				 .getAsInt();
			System.out.println("첫번째 3의 배수 : " + first);
		

	}

}
