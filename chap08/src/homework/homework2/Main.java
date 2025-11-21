package homework.homework2;

public class Main {

	public static void main(String[] args) {
		Menu[] menus = new Menu[5];
		
		for (int i = 0; i < menus.length; i++) {

            int r = (int)(Math.random() * 2);

            if (r == 0) {
            	menus[i] = new Drink("아메리카노", 5000, "에스프레소 1샷, 물");
            } else { // Dish 생성
            	menus[i] = new Dish("스테이크", 30000, "소고기, 소금, 후추");
            }
        }

        for (Menu m : menus) {
            m.cook();
        }
		

	}

}
