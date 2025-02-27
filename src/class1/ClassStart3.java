package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1; //Student 변수 선언(참조 변수)
        student1 = new Student(); //메모리를 할당에 변수에 담음.
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 90;

        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 80;

        Student[] students = new Student[] {student1, student2}; //배열의 원소가 Student 클래스 인스턴스

        for (int i = 0; i < students.length; i++){
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
        }
        for (int i = 0; i < students.length; i++){
            Student s = students[i];
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }

}
