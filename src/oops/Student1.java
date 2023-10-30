package oops;

class StudentText {
    int id;
    String name;
}
public class Student1 {
    public static void main(String[] args) {
        StudentText s1 = new StudentText();
        s1.id = 10;
        s1.name = "leo";
        System.out.println(s1.id + " " + s1.name);
    }
}
