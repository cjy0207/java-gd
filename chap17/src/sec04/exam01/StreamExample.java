package sec04.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		for (int i = 0; i <= 5; i++) {
			Product p = new Product(i, "상품" +i, "멋진 회사", (int)(Math.random() * 10000));
			list.add(p);
		}
		
		//객체 스트림 얻기 + 객체 출력하기
		Stream<Product> stream = list.stream();
		stream.forEach(p -> System.out.println(p));
		
		//참조
		list.stream().forEach(System.out::println);
		
		//참고 : Iterable 인터페이스에 정의된 forEach도 있음
		//여러 중간 처리필요없이 잔순 순회 작업 시
		list.forEach(p -> System.out.println(p));
	}

}
