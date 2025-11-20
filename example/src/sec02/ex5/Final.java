package sec02.ex5;

public class Final {
	  public static void process(final int[] nums, String text) {
	    nums[0] = 50;

	    text = "World";
	  }

	  public static void main(String[] args) {
	    int[] numbers = {10, 20};
	    String message = "Hello";

	    process(numbers, message);

	    System.out.print(numbers[0] + message);
	  }
	}