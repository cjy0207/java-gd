package sec01.exam02;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int min = 5;
		System.out.print(hour+"시간"+min +"분");
		
		int totalMin = (hour*60)+min;
		System.out.print("총" + totalMin +"분");
	}
}
