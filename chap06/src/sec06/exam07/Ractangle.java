package sec06.exam07;

public class Ractangle {

	private int width;
	private int height;

	public Ractangle() {
		this.width = 1;
		this.height = 1;
	}

	public Ractangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int calculateRound() {
		return (width * 2) + (height * 2);
	}

	public int calculateArea() {
		return width * height ;
	}

	public void printInfo() {
		System.out.println("둘레 : " + calculateRound());
		System.out.println("넓이 : " + calculateArea());
	}

}
