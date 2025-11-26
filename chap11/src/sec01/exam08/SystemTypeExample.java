package sec01.exam08;

import java.util.Iterator;

public class SystemTypeExample {

	public static void main(String[] args) {
		
		//1부터 100만까지의 합을 구하는데 걸리는 시간 측정
		
		long start = System.nanoTime(); //시작 시간
		int sum = 0;
		for (int i = 0; i < 1000000; i++) {
			sum += i;
		}
		
		long end = System.nanoTime();//끝 시간
		
		long result = end - start;
		
		System.out.println("합 : " + sum);
		System.out.println(result);
		
		//실핼시간 측정할 때
		

	}

}
