package homework.homework2;

public class GreenTeaController {

    private GreenTea gt = new GreenTea();

    public String bakeGreenTeaCake(double flour, double cream, double powder, int cheese) {
        gt.setFlour(flour);
        gt.setCream(cream);
        gt.setPowder(powder);
        gt.setCheese(cheese);

        return gt.toString() + "\n녹차 케이크가 완성되었습니다.";
       
    }
}