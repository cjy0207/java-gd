package homework.homework02;

public class Practice {
	
	public String takeState(String state) {
		
		String[] arr = state.split(" ");
		
		for (String last : arr) {
            if (last.charAt(last.length() - 1) == '구') {
                return last;
            }
        }

	    return null;
	}

}
