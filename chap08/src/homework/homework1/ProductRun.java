package homework.homework1;

public class ProductRun {

	 public static void main(String[] args) {
	        Product p1 = new Food("치킨", 20000, 3);  
	        Product p2 = new Book("자바의 정석", 15000);

	        int foodFinalPrice = p1.calculatePrice();
	        int bookFinalPrice = p2.calculatePrice(); 

	        System.out.println(p1.getName() + "의 최종 가격 : " + foodFinalPrice + "원");
	        System.out.println(p2.getName() + "의 최종 가격 : " + bookFinalPrice + "원");
	    }

}
