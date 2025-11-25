package homework.homework3;

public class CharCheckException extends Exception{
	
	 public CharCheckException() {
	        super("체크할 문자열 안에 공백이 포함되어 있습니다.");
	    }

	    public CharCheckException(String msg) {
	        super(msg);
	    }

}
