package homework.homework04;

public class Library {

	void printMessage(String str1){
		System.out.println("str1 : " + str1);
	}
	
	void sumToHundred(){
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1-100까지의 합 : " + sum);
	}
	
	void checkOddEven(int num1){
		String result = (num1%2==0) ? "짝수" : "홀수";
		System.out.println("num1은 " + result + "입니다.");
	}
	
	void containsAlphabet(String str2){
        boolean hasAlphabet = false;

        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                hasAlphabet = true;
                break;
            }
        }
        System.out.println("영문자 포함 여부 : " + hasAlphabet);
    }
	
	
    void countChar(String str3, char ch){
        int count = 0;

        for (int i = 0; i < str3.length(); i++) {
            if (str3.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("포함 되는 문자 개수 : " + count);
    }
	
	
	void printGugudan(int num2){
		for(int i = 1 ; i<=9; i++) {
			System.out.println(num2 + " * " + i + " = " +(num2*i));
		}
	}
}

