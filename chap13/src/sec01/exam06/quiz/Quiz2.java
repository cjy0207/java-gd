package sec01.exam06.quiz;

import java.util.HashSet;
import java.util.Set;

public class Quiz2 {
//	Quiz
//	여러명의 손님이 음식 주문을 하고 있습니다.
//	손님들이 주문한 음식 정보를 HashSet에 추가하여 관리하려고 합니다.
//	아래 초기 데이터를 보고 HashSet에 요소를 추가하세요.
//	치킨 중에서 50000원짜리 치킨을 주문 취소하고 전체 목록을 출력하세요.
//	모든 주문을 취소한 후 전체 목록을 출력하세요.
	
//	[초기 데이터]
//	이름   |  가격
//  -------------
//	샐러드 |  14000
//	치킨   |  23000
//	치킨   |  50000
	
//	[출력]
//	5만원 치킨 취소: [치킨:23000, 샐러드:14000]
//	전체 주문 취소: []
	
	public static void main(String[] args) {
		
		Set<Food> setFood = new HashSet<Food>();
		setFood.add(new Food("샐러드", 14000));
		setFood.add(new Food("치킨", 23000));
		setFood.add(new Food("치킨", 50000));
		
		setFood.remove(new Food("치킨", 50000));
		System.out.println("5만원 치킨 취소 : " + setFood);
		
		setFood.clear();
		System.out.println("전체 주문 취소 : " + setFood);
		
		
	}

}
