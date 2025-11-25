package sec02.exam01;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		
		//에외 처리 : 예외는 발생했지만 프로긂이 갑자기 종료되는 것을 막고 정상 실행 흐름(상태)을 유지하도록 함
		
		
		//일반 예외 : 컴파일러가 체크하여 에외처리 넣으라고 컴파일 에러 유발
		try {
			Class clazz = Class.forName("java.lang.String2"); // 주어진 이름의 클래스를 찾아서 Class 객체로 반환
			System.out.println("클래스를 찾음");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("클래스 없음");
		} finally {
			//optional 필요에 따라 작성
			//예외 발생 유뮤와 상관없이 무조건 실행
			System.out.println("프로그램 종료");
		}

	}

}
