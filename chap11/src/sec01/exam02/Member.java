package sec01.exam02;

public class Member {// 명시적으로 상속받은게 없다면 자동으로 Object를 상속
	public String id;
	
	public Member(String id) {
		this.id = id;
		
	}
	
	@Override
		public boolean equals(Object obj) {
		
			// 매개 변수의 타입이 Object 타입이기 떄문에 모든 객체가 대입 가능
			//제일 먼저 매개값이 Member 타입인지 확인이 필요
			if(obj instanceof Member) {
				//id필드에 접근하기 위해 Member타입으로 강제 타입 변환
				Member member = (Member) obj;
				//id 필드값이 동일한지 검사
				if(id.equals(member.id)) { //여기서의 equals는 String에 재정의 된 메소드로 문자열을 비교
					return true;
				} 
			}
			
			//매개값이 Member 타입이 아니거나
			//id 필드값이 다른경우 false리턴
			return false;
		}
	
	
}
