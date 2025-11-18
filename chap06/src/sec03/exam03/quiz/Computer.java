package sec03.exam03.quiz;

public class Computer {
	String model;
	
	Computer(){
		System.out.println("객체 생성완료(모델 : " + this.model);
	}
	
	Computer(String model){
		this.model = model;
		System.out.println("객체 생성완료(모델 : " + this.model);
	}

}
