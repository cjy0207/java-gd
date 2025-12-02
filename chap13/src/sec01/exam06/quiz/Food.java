package sec01.exam06.quiz;

import java.util.Objects;

public class Food {
	

//	Food 클래스
//	1. 필드
//		- name: String
//		- price: int
//	2. 생성자
//		+ Food()
//		+ Food(name: String, price: int)
//	3. 메소드
//	중복되는 요소를 추가했을 때 저장되지 않도록 hashCode()와 equals() 재정의
//	출력 예시에 맞춰 toString() 재정의
	private String name;
	private int price;
	
	public Food() {}
	
	public Food(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}

	@Override
	public String toString() {
		return "["+ name + " : " + price + "]";
	}
	
	
	

}
