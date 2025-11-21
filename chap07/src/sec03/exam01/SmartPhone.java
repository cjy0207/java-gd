package sec03.exam01;

//실체 클래스
public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("검색");
	}
}
