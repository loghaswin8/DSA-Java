package oops;

class Employee {
    int id;
    String name;
    float salary;
    void insert (int r, String n, float s) {
        id = r;
        name = n;
        salary = s;
    }
    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}
public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.insert(101, "Ramesh", 25000);
        e2.insert(102, "Ayyapan", 45000);
        e1.display();
        e2.display();
    }
}
