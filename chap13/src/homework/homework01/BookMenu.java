package homework.homework01;

import java.util.List;
import java.util.Scanner;

public class BookMenu {
	
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();

	public void mainMenu() {
		
		while (true) {
			System.out.println("=== 구디 도서관에 오신걸 환영합니다 ===");
			System.out.println("원하시는 업무의 번호를 선택하세요.");
			System.out.println("1. 새 도서 추가"); // insertBook()
			System.out.println("2. 도서 전체 조회"); // selectList()
			System.out.println("3. 도서 검색 조회"); // searchBook()
			System.out.println("4. 도서 삭제"); // deleteBook()
			System.out.println("5. 도서 오름차순 정렬"); // ascBook()
			System.out.println("9. 종료"); // "프로그램을 종료합니다." 출력 후 종료
			System.out.print("메뉴 선택: ");

			int menuNo = sc.nextInt();
			sc.nextLine();
			switch (menuNo) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				break;
			}
		}
	}

	// 1. 새 도서 추가 view 메소드
	public void insertBook() {
		
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("장르 : ");
		int categoryNo = sc.nextInt();
		
		String category;
		switch (categoryNo) {
		case 1: category = "인문"; break;
		case 2: category = "자연과학"; break;
		case 3: category = "어린이"; break;
		default : category = "기타"; break;
		}
		
		Book bk = new Book(title, author, category, price);
		bc.insertBook(bk);
		System.out.println();
	}

	// 2. 도서 전체 조회 view 메소드
	public void selectList() {
		List<Book> bookList = bc.selectList();
		
		if(bookList.isEmpty()) System.out.println("존재하는 도서가 없습니다.");
		else {
			for (Book book : bookList) {
				System.out.println(book);
			}
		}
		System.out.println();
	}

	// 3. 도서 검색 조회 view 메소드
	public void searchBook() {
		System.out.print("검색어 : ");
        String keyword = sc.nextLine();

        List<Book> searchList = bc.searchBook(keyword);

        if (searchList.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            for (Book book : searchList) {
                System.out.println(book);
            }
        }
        System.out.println();
	}

	// 4. 도서 삭제 view 메소드
	public void deleteBook() {
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		
		if(remove != null) System.out.println("성공적으로 삭제됨");
		else System.out.println("삭제할 도서를 찾지 못했습니다");
		System.out.println();
	}

	// 5. 도서 오름차순 정렬 view 메소드
	public void ascBook() {
		int result = bc.ascBook();
		
		if(result ==1) {
			System.out.println("정렬 성공");
			selectList();
		}
		else System.out.println("정렬 실패");
	}
}
