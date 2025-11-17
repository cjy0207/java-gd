package homework_array;

import java.util.Arrays;

public class Homework8 {
    public static void main(String[] args) {

        String[] menu = {"Burger", "Pizza", "Pasta"};
        String[] add = {"Salad", "Soup"};

        String[] todayMenu = Arrays.copyOf(menu, menu.length + add.length);

        for (int i = 0; i < add.length; i++) {
            todayMenu[menu.length + i] = add[i];
        }

        System.out.println("어제 메뉴판: " + String.join(", ", menu));
        System.out.println("오늘 메뉴판: " + String.join(", ", todayMenu));
    }
}
