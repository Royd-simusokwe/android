public class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println(obj);
    }
}

public class Student {
    String name;
    int age;

    Student() {
        System.out.println("Hello, there!");
    }
}