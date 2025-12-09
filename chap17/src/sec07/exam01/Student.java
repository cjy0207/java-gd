package sec07.exam01;

public class Student implements Comparable<Student>{
	
	private String name;
	private int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	@Override
	public int compareTo(Student o) {
		
//		if(this.score < o.score) return -1;
//		else if(this.score > o.score)return 1;
//		else return 0;
		
		//위 비교 연산을 이미 구현한 메소드
		return Integer.compare(this.score, o.score);

	}

}
