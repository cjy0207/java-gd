package homework.homework3;

public class CharacterController {

	public CharacterController() {}
	
	public int countAlpha(String s) throws CharCheckException {
		
		if (s.contains(" ")) {
            throw new CharCheckException("문자열에 공백이 포함되어 있습니다.");
        }
		
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') ||
                (ch >= 'a' && ch <= 'z')) {
                count++;
            }
        }

        return count;
	}
	
	
	
	
	
}
