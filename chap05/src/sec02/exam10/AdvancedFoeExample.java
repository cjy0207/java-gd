package sec02.exam10;

public class AdvancedFoeExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("total score : " + sum);
		
		double avg = (double) sum /scores.length;
		System.out.println("avg score : " + avg);

	}

}
