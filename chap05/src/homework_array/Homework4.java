package homework_array;

import java.util.Arrays;

public class Homework4 {

	public static void main(String[] args) {
		int[]a = new int[6];
		
		for(int i = 0; i < a.length; i++) {
			int num = (int)(Math.random()*45) + 1;
			
			for (int j = 0; j < i; j++) {
				if (a[j] == num) {
                    i--;
                    break;
                }
			}
			
			a[i] = num; 
		}
		
		Arrays.sort(a);
		System.out.print(Arrays.toString(a));


	}

}
