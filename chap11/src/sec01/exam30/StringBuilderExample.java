package sec01.exam30;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		//StringBuilder
		//문자열을 변경 가능한 객체로다뤽 위해 만들어졌으며,
		//문자열을 이어붙이거나 수정할 떄 보다 효울적이고 성능상 유리
		//나중 연산 시 메모리 절약 가능
		//StringBuffer와 완전 동일, 동기화 기능만 제거(싱글 스레드인 경우 성능 향상)
		//동기화란?
		//멀티 스레드 환경에서 덩시에 뱐걍하려고 할 때 데이터 보호 가능
		
//		StringBuilder sb = new StringBuilder("Java");
		StringBuilder sb = new StringBuilder("Java");
		
		
		//기존 문자열의 끝에 주어진 값을 추가
		sb.append(" Program Study");
		sb.append(" now ").append("start"); //메소드 체이닝 가능
		System.out.println(sb.toString());
		
		//지정한 인덱스에 주어진 값을 삽입
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		//지정한 인덱스의 문자를 주어진 문자로 변경하기
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		//지정한 시작 인덱스부터 끝 인덱스 이전까지의 문자열을 다른 문자열로 대체
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		//지정한 시작 인덱스부터 끝 인덱스 이전까지의 문자열을 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		//현재 StringBuilder에 담김 문자열의 길이를 반환
		int length = sb.length();
		System.out.println("총 문자 수 : " + length);
		
		//현재 StringBuilder에 담긴 문자열 내용을 String 객체로 반환
		String result = sb.toString();
		System.out.println(result);
		
		//정리
		//String 객체는 불변이지만 StringBuilder로 가변 가능
		//내부에서 문자열을 저장해서 조작하기 떄문에 변경이 있을 때마가 객체를 만들지 않음
		//문자열을 많이 변경할 경우 String 보다 StringBuilder를 쓰는게 성능상 좋음
		//
		
		

	}

}
