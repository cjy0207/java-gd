package homework_array;

public class Homework1 {

	public static void main(String[] args) {
		
		int[] cm = {152, 180, 165, 158, 171};
		
		for(int i = 0; i<cm.length-1; i++) {
			for(int j = i+1; j<cm.length; j++) {
				if(cm[i]>cm[j]) {
					int tmp = cm[i];
					cm[i] = cm[j];
					cm[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < cm.length; i++) {
			System.out.print(cm[i]+", ");
		}

	}

}
