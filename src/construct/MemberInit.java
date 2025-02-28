package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade){
        this.name = name; // name = name; 이면 가까운 scope인 매개변 name이 된다.
        // MemberInit의 멤버변수의 값이라는 것을 말한다. 즉 자기자신 인스턴스를 가르킴.
        this.age = age;
        this.grade = grade;
    }
}
