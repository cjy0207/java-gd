package sec02.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		
		//이클립스에서 실행할 떄 argument 주는 방법
		//Run Configuration > Arguments
		
		if (args.length!=2) {
			System.out.println("값의 수가 옳바르지 않습니다.");
			//return;
			System.exit(0); //JVM 강제종료 코드
			//여기서 0은 정상 종료를 의미
		}
		
		int sum = 0; 
		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		
		System.out.println(sum);

	}

}
