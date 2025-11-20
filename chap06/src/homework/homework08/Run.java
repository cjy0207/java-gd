package homework.homework08;

public class Run {
	
	 public static void main(String[] args) {
	        Employee emp = new Employee();

	        emp.setEmployee(
	            100, "홍길동", "영업부", "과장",
	            25, '남', 3000000, 0.05,
	            "010-123-4567", "서울시 강남구"
	        );

	        emp.getEmployee();
	    }

}
