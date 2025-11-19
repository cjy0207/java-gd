package sec06.exam06;

public class Member {

	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;

	public Member() {

	}

	public void changeName(String name) {
		this.memberName = name;
	}

	public void printName() {
		System.out.print("이름 : " + memberName);
	}

}
