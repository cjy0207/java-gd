package sec01.exam03;

public class Key {

	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("재정의 된 equals호출");
		
		if(obj instanceof Key cpmpareKey) {
			if(this.number == cpmpareKey.number) return true;
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {
		System.out.println("재정의된 hashCode호출");
		//number 필드이 값이 같은 모든 key객체는 동이한 해시코드가 나오게 만들어줌
		return number;
	}
}
