package sec04.exam02;

public class Computer {
	// 매개값의 수와 상관 없이 주어진 매개값을 다 더해서 리턴하는 메소드

	// 1. 매개 벼누수를 배열 타입으로 선언
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}

		return sum;
	}

	// 2. 가변 인자 ...
	int sum2(int... values) {
		int sum2 = 0;
		for (int i = 0; i < values.length; i++) {
			sum2 += values[i];
		}

		return sum2;
	}
}
