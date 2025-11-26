package homework.homework01;

public class Run {

	public static void main(String[] args) {
		
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		
		String[] arr = str.split("\n");
		Person[] person = new Person[arr.length];
		
		
		for (int i = 0; i < arr.length; i++) {
			String[] arr2 = arr[i].split(",");
			person[i] = new Person(arr2[0], Integer.parseInt(arr2[1]),arr2[2], arr2[3].charAt(0));
		}
		
		for (Person p : person) {
            System.out.println(p.toString());
        }

	}

}
