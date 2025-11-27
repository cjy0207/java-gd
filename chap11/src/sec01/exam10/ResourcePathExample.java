package sec01.exam10;

public class ResourcePathExample {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		//Class객체는 해당 클래스의 파이릐 경로 정보를 갖고 있음
		String photoPath = clazz.getResource("").getPath();
		System.out.println(photoPath);
		
		String photoPath2 = clazz.getResource("").getPath();
		System.out.println(photoPath2);

		
	}

}
