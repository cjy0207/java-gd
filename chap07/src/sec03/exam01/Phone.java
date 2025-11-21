package sec03.exam01;


//추상 클래스
//미완성 설계도(미완성된 메소드를 갖고있는 클래스
//공통 설계도(공통 특성을 모아놓은 클래스) => 즉, 부모 클래스로 쓰임
//공통 기능을 일부 구현해놓고, 하위 클래스가 나머지를 구현하도록 할 때
//예 : 동물 숨쉬기(공통 처리 로직 : 모든 동물은 숨을 쉰다)와 소리내기(자식에게 구현을 강제하는 메소드 : 울음소리는 동물마다 다름)

//이 예제에서는 공통 기능만 제공
//공통 기능만 제공하는데 굳이 추상화의 이유
//인스턴스화 목적이 아니라는 의도가 명확
//즉, 실수로 불필요한 인스턴스화를 방지하고 상속을 통해서만 쓰겠다는 의미
public abstract class Phone {
	
	//폰의 공통된 특성을 작성
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("turnOn");
	}
	
	public void turnOff() {
		System.out.println("turnOff");
	}

}
