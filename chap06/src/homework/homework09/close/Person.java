package homework.homework09.close;

public class Person {

    private String name;
    private int age;

    public Person() {}
    
    public Person(String name, int age) {
    	 this.name = name;
         this.age = age;
    }

    public void setPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getPerson() {
        System.out.println(name + "는 " + age +  "살 입니다.");
    }

    

}