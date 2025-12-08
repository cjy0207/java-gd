package sec02.exam02;

public class ButtonExample {

	public static void main(String[] args) {
		
		Button btnOk = new Button();
		
		//ok 버튼 객체에 라맏식 주입
		
		btnOk.setClickListener(()->{
			System.out.println("버튼이 클릭됨");
		});
		btnOk.click();
		
		Button btnCancle = new Button();
		
		btnCancle.setClickListener(()->{
			System.out.println("캔슬이 클릭됨");
		});
		
		btnCancle.click();

	}

}
