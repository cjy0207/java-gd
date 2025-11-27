package sec01.exam09;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class CarExample {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//Class객체
		//자바에서 해당 클래스의 메타 데이터를 표현하는 객체
		//메타 데이터 : 데이터에 대한 데이터
		//JVM 내에서 한 클래스 당 하나의 Class만 존재
		
		
		//Car 클래스의 Class객체 얻기
		
		//방법1
		Class clazz = Car.class;
		
		//방법2
		Class clazz2 = Class.forName("sec01.exam09.Car");
		
		//방법3
		Car car = new Car();
		Class clazz3 = car.getClass();
		
		
		//참고 : 1,2,3 모두 같은 Class객체를 참조
		System.out.println(clazz==clazz2);
		System.out.println(clazz==clazz3);
		System.out.println(clazz3==clazz2);
		
		System.out.println(clazz.getName()); //클래스 전체 이름
		System.out.println(clazz.getSimpleName()); //패키지 이름을 제외한 순수 클래스 이름 
		System.out.println(clazz.getPackageName()); //패키지 이름
		
		
		//참고 : 리플렉션
		//이 외에도 필드/생성자/메소드 정보도 얻을 수 있는데
		//이 벙보를 얻어 활용하는 것을 자바에서 리플렉션이라고 함
		//일반적인 앱 개발에서 잘쓰지않고 주로 프레임워크/라이브러리 개발에서 쓰임
		
		//필드 정보 출력
		System.out.println("===field===");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getName() + field.getType().getSimpleName() + Modifier.toString(field.getModifiers()));
		}
		System.out.println();
		
		System.out.println("===constructor===");
		Constructor<?>[] constructors =  clazz.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor.getName() + constructor.getParameterCount());
		}
		System.out.println();
		
		//메소드 정보 출력
		System.out.println("===method===");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName() + method.getReturnType().getSimpleName() + method.getParameterCount() + Modifier.toString(method.getModifiers()));
		}
		
		
		
		

	}

}
