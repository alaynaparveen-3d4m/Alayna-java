class Teacher {
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void teach() {
        System.out.println("I am teaching");
    }
}

class Student extends Teacher {
    private String rollNo;
    private int marks;

    public Student(String name, int age, String rollNo, int marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    void study() {
        System.out.println("Students are studying");
    }
}

public class Management {
    public static void main(String[] args) {
        // Fix: marks should be an int, so let's say 85
        Student student1 = new Student("Alice", 20, "S12345", 85);
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Age: " + student1.getAge());
        System.out.println("Student Roll No: " + student1.getRollNo());
        System.out.println("Student Marks: " + student1.getMarks());

        student1.setName("Alicia");
        System.out.println("Updated Student Name: " + student1.getName());

        System.out.println();

        // Teacher only has name and age constructor
        Teacher teacher1 = new Teacher("Mr. Smith", 45);
        System.out.println("Teacher Name: " + teacher1.getName());
        System.out.println("Teacher Age: " + teacher1.getAge());
    }
}
