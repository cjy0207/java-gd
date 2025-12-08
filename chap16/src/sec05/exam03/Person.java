package sec05.exam03;

public class Person {
	
	public Member getMember1(Creatable creatable) {
		String id = "winter";
		Member m = creatable.create(id);
		return m;
	}
	
	
	public Member getMember2(Creatable2 creatable) {
		String id = "winter";
		String name = "한겨울";
		Member m = creatable.create(id, name);
		return m;
	}

}
