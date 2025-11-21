package sec02.exam03;

public class Tire {
	
	public int maxRotation; // 최대 회전 수(수명)
	public int accumulatedRotation; // 누적 회전수, 최대 회전수와 같아지면 타이어 펑크
	public String location; //타이어의 위치
	
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	//메소드
	//타이어를 1회전 시키는 메소드
	//회정 할 수 있다면 true, 펑크가 나서 회전 할 수 없다면 false
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire의 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}
	
	
	

}
