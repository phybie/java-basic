package ref;

public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        initStudent(student1, "학생1", 16, 90);
        initStudent(student2, "학생2", 17, 80);
        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
    }

    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

}
