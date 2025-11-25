package sec02.exam03;

public class CatchByExceptionExample {

	public static void main(String[] args) {
		//다중 catch문
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0]; 
			data2 = args[1];	
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (NumberFormatException| NullPointerException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
		
		// 자바 7이상부터 멀티캐치 구문 가능
		//여러 예외를  | 로 연결해서 하나의 catch문 블록에서 처리 가능
		
		
	}

}
