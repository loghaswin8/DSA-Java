package oops;

class StudentTest2 {
    int id;
    String name;
    void insertRecord (int r, String n) {
        id = r;
        name = n;
    }
    void displayInformation (){
        System.out.println(id + " " + name);
    }
}
public class Student2 {
    public static void main(String[] args) {
        StudentTest2 s1 = new StudentTest2();
        StudentTest2 s2 = new StudentTest2();
        s1.insertRecord(10, "messi");
        s2.insertRecord(11, "neymar");
        s1.displayInformation();
        s2.displayInformation();
    }
}