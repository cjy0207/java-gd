package sec12.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
	
	public static void main(String[] args) {
		
		List<Student> totalList = new ArrayList<Student>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("이수진", "여", 87));
		totalList.add(new Student("김재현", "남", 95));
		totalList.add(new Student("양지은", "여", 93));
		
		//요소 그룸핑 : 성별로 그룸화
		Map<String, List<Student>> map = totalList.stream()
			.collect(
					Collectors.groupingBy(s -> s.getGender()) //그룹핑 키를 리턴 -> Map 객체의 키로 쓰임
			);
		
		List<Student> maleList = map.get("남");
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();
			
		
		
	}

}
