package homework.homework02;

public class Run {

	public static void main(String[] args) {
		
		Practice practice = new Practice();
		String str1 = "서울특별시 금천구 구로디지털2로 95";
		String str2 = "서울특별시 서대문구 연희로 248";
		String str3 = "울산광역시 남구 돋질로 233";
		String str4 = "경상북도 구미시 송정대로 55";
		
		System.out.println(practice.takeState(str1));
		System.out.println(practice.takeState(str2));
		System.out.println(practice.takeState(str3));
		System.out.println(practice.takeState(str4));

	}

}
