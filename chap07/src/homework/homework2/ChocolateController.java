package homework.homework2;

public class ChocolateController {
	
	private Chocolate c = new Chocolate();
			
    public String bakeChocolateCake(double flour, double cream, int cherry, int chip) {
        c.setFlour(flour);
        c.setCream(cream);
        c.setCherry(cherry);
        c.setChip(chip);

        return c.toString() + "\n초콜릿 케이크가 완성되었습니다.";
    }
}