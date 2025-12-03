package homework.homework02;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class LotteryMenu {
	
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		
		while (true) {
			System.out.println("===== 로또 번호 추첨 =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 추첨 대상 추가"); // insertObject()
			System.out.println("2. 추첨 대상 삭제"); // deleteObject()
			System.out.println("3. 추첨 대상 목록 조회"); // searchObject();
			System.out.println("4. 당첨 대상 구성"); // winObject()
			System.out.println("5. 정렬된 당첨 대상 확인"); // sortedWinObject()
			System.out.println("6. 당첨 대상 검색"); // searchWinner()
			System.out.println("9. 종료"); // "프로그램을 종료합니다."출력
			System.out.print("메뉴 번호: ");
			
			try {
				int menuNo = sc.nextInt();
				sc.nextLine();
				switch(menuNo) {
					case 1: insertObject(); break;
					case 2: deleteObject(); break;
					case 3: searchObject(); break;
					case 4: winObject(); break;
					case 5: sortedWinObject(); break;
					case 6: searchWinner(); break;
					case 9: System.out.println("프로그램 종료."); return;
					default: 
						System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
						break;
				}
			} catch (InputMismatchException e) {
				System.err.println("숫자만 입력하라구~~~");
				sc.nextLine();
			}
		}
	}
	
	// 1. 추첨 대상 추가용 view 메소드
	public void insertObject() {
		
		System.out.println("=== 1. 추첨 대상 추가 ===");
		System.out.print("추가할 추첨 대상 수 : ");
		int count = sc.nextInt();
		sc.nextLine();
		
		int added = 0;
		
		while(added < count) {
			System.out.print("이름 : ");
            String name = sc.nextLine();
            
            System.out.print("번호 : ");
            String phone = sc.nextLine();

            Lottery l = new Lottery(name, phone);

            if (!lc.insertObject(l)) {
                System.out.println("중복된 대상입니다. 다시 입력하세요.");
                continue;
            }
            added++;
		}
		System.out.println(count + "명 추가 완료");
			
 	}
	
	// 2. 추첨 대상 삭제용 view 메소드
	public void deleteObject() {
		sc.nextLine();
		System.out.println("=== 2. 추첨 대상 삭제 ===");
        System.out.println("삭제할 대상의 이름과 번호 를 입력하세요.");

        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("번호 : ");
        String phone = sc.nextLine();

        boolean result = lc.deleteObject(new Lottery(name, phone));
       if(result) System.out.println("삭제 완료");
       else  System.out.println("존재하지 않는 대상");
       

	}
	// 3. 추첨 대상 목록 조회 view 메소드
	public void searchObject() {
		System.out.println("=== 3. 추첨 대상 목록 조회 ===");
		System.out.println(lc.searchObject());
	}
	
	// 4. 당첨 대상 확인용 view 메소드
	public void winObject() {
		System.out.println("=== 4. 당첨 대상 구성 ===");
		Set<Lottery> result = lc.winObject();
		if(result == null) {
			System.out.println("추첨 대상이 4명 이상이어야 당첨 대상을 구성할 수 있습니다.");
			return;
		}
		System.out.println(result);
		
	}
	
	// 5. 정렬된 당첨 대상 확인
	public void sortedWinObject() {
		// lc에서 받아온 Set 객체를 Iterator를 통해 출력
		Set<Lottery> sorted = lc.sortedWinObject();
		Iterator<Lottery> it = sorted.iterator();
		
		while(it.hasNext()) System.out.println(it.next());
	}
	
	// 6. 당첨 대상 검색용 view 메소드
	public void searchWinner() {
		System.out.println("===== 6. 당첨 대상 검색 =====");
        System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력");

        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("번호 : ");
        String phone = sc.nextLine();

        boolean result = lc.searchWinner(new Lottery(name, phone));

        if (result)
            System.out.println("축하합니다. 당첨 목록에 존재합니다.");
        else
            System.out.println("다음 기회에!");
	}
}