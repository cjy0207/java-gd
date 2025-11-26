package sec01.exam03;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		
		//Map : key/value 쌍으로 저장하는 컬렉션
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap객체 생성
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//실별키  "new Key(1)"으로 "홍길동"을 저장
		hashMap.put(new Key(1), "홍길동");
		
		//실별키  "new Key(1)"으로 "홍길동"을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		//equals 메소드 재정의 했음에도 동등객체로 판단하지 않는다.
		//get을 할 때, hashMap을 먼저 비교하고 그 다음 equals로 비교하기 때문
		//즉, hashCode도 재정의 필요
		
		// => 그래서 hashMap 카로는 String이 가장 많이 사용됨( 이미 hashCode와 equals가  재정의 되어있음
		//만약 사용자 정의 객체를 키로 쓸 떄는 hashCode와 equals를 반드시 재정의 해야함
		HashMap<String, String> hashMap2 = new HashMap<String, String>();
		hashMap2.put(new String("1"),"짐재현");
		hashMap2.put(new String("2"),"혼재현");
		System.out.println(hashMap2.get(new String("1")));
		
		
		//참고
		//hashCode가 재정의 된 대표적인 예
		String str1 = "김";
		String str2 = "김";
		String str3 = new String("김");
		String str4 = new String("김");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		//다른 객체여도 같은 해시코드를 가짐
		// => String클래스에 재정의 된 hashCode호출
		
		//시스템이 구성한 닶 그대로 출력
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		

	}

}
