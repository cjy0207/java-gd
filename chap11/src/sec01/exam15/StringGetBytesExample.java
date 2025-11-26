package sec01.exam15;

//문자열 바이트 배열로 전환
//쓰는 경우
//파일에 문자열을 바이트로 저장할 떄
//네트워크 전송시 문자열을 바이트로 변환할때
//문자열 암호화/캐시 처리할때 
public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "Hello";
		
		//인코딩 : 문자열 바이트 배열로 바꾸기 
		byte[] bytes1 = str.getBytes();	//시스템의 기본 문자셋 사용
		System.out.println("bytes.length : " + bytes1.length);
		//한글 1자를 UTF-8로 안코딩하ㅕㄴ 3바이트가 되고, EUC-KR로 인코딩하면 2바이트가됨
		
		//디코딩 : 바잍 배열을 문자열로 다시 복원하기
		String str1 = new String(bytes1);
		System.out.println("bytes -> String : " + str1);
		
		
		try {
			//특정 문자셋으로 인코딩
			byte[] bytes2 = str.getBytes("EUR-KR"); 
			System.out.println("bytes.length : " + bytes2.length);//10
			//특정 문자셋으로 디코딩
			String str2 = new String(bytes2);
			System.out.println("bytes -> String : " + str1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
