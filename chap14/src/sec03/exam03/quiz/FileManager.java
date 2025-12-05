package sec03.exam03.quiz;

import java.io.File;

public class FileManager {
	
//	FileManager 클래스에 deleteFile(dir: File): void 메소드를 정의합니다.
//	실행 클래스에서 FileManager 클래스를 객체화한 다음 deleteFile() 메소드를 호출하세요.
//	deleteFile()은 "C:/test/sub" 아래에 있는 파일들을 모두 삭제하는 기능을 수행합니다.
	
	public void deleteFile(File dir) {
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("오류" + dir.getPath());
			return;
		}
		
		File[] files = dir.listFiles();
		for (File file : files) {
			if(file.isFile()) {
				boolean deleted = file.delete();
				if(deleted) System.out.println(file.getPath() + " : 삭제 완료");
				else System.out.println(file.getPath() + " : 삭제 안됨");
			}
			
		}
		
	}
	
	
}
