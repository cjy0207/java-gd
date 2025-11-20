package homework.homework10;

public class Student {

    private static int count = 0; 
    private int studentNo;       
    private String name;  
    private String className;

    public Student() {
        count++;
        this.studentNo = count;
    }

    public void setStudent(String name, String className) {
        this.name = name;
        this.className = className;
    }
    
    public void getStudent() {
        System.out.println(studentNo + name + className);
    }

}