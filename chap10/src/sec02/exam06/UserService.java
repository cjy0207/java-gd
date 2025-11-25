package sec02.exam06;

public class UserService {

	public void registerUser(int age) {
		if(age<0) {
			//throw : 예외 발생 시키기
			throw new InvalidAgeException("나이는 0보다 작을 수 없음"); //예외 메시지 작성
			//만약 InvalidInputException 처럼 예외를 범용적으로 만들면
			//메시지를 통해 무슨 오류인지 명확하게 표현 가능
		}
		System.out.println("사용자 등록 완료(나이 : " + age + ")");
	}
}
