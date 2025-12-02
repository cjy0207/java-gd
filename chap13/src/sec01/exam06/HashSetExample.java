package sec01.exam06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		//인스턴스는 다르지만 내부 데이처가 동일한 경우
		//객체의 hashCode와 equals를 기분으로 동등성 판단
		set.add(new Member("김재현", 30));
		set.add(new Member("김재현", 30)); //논리적 동등 객체 -> 중복 저장 안됨 
		
		System.out.println(set);
		
		//이외에도 동등 객체로 판단하는 많은 메소드들이 제대로 동작하려면 재정의 필수임
		
		//요소 정렬
		//Member처럼 사용자 정의 객체끼리 비교할 경우 비교 불가능
		//정렬 기준으로 어떤 값을 사용할지 별도로 구현
		//=> Member 클래스가 Comparable 인터페이스를 구현
		Set<Member> members = new HashSet<Member>();
		members.add(new Member("김재현", 30));
		members.add(new Member("이수진", 25));
		members.add(new Member("박민수", 40));
		
		List<Member> memberList = new ArrayList<Member>(members);
		
		Collections.sort(memberList);
		//람다식 오름차순 정렬
		memberList.sort((a,b) -> a.getAge() - b.getAge());
//		memberList.sort((a,b)-> a.getName().compareTo(b.getName())); //이름 오름차순
		
		
		System.out.println(memberList);
		
		for (Member member : memberList) {
			System.out.println(member.getName() + "-" + member.getAge());
		}
		
		//다시 set으로 변환 -> LinkedHashSet
		Set<Member> sortedSet = new LinkedHashSet<Member>(memberList);
		System.out.println(memberList);
		System.out.println();
		
		//ArrayList의 중복요소 제거하기
		List<Member> memList = new ArrayList<Member>();
		memList.add(new Member("김재현", 30));
		memList.add(new Member("이수진", 25));
		memList.add(new Member("박민수", 40));
		memList.add(new Member("김재현", 30)); //중복
		memList.add(new Member("이수진", 25)); //중복
		
		Set<Member> list = new HashSet<Member>(memList);
		System.out.println(list);
		
		
		//=> Comparator 인터페이스를 구현해서 다영한 정렬 기준을 제공

	}

}
