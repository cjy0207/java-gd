package sec01.exam01;

// 자식 클래스: 일반적인 특성은 물려받고 추가로 자식만이 갖는 멤버(필드, 메소드) 작성
// 여기서는 CellPhone을 확장하여 DMB 기능만 추가된 클래스
public class DmbCellPhone extends CellPhone {
	// 필드
	int channel;
	
	// 생성자
	public DmbCellPhone(String model, String color, int channel) {
		super(); //생략 시 자동추가
		this.model = model; //상속
		this.color = color; //상속
		//참고 : 부모로부터 물려받았음을 보여주기 위함이며 일번적으로는 이렇게 초기화 하지 않음
		//super(color, model); //부모에 생성자를 만들고 전달하는 방식으로 초기화
		
		this.channel = channel;
		
	}
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
