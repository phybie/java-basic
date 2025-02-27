package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("호출 전 a = " + a);
        changePrimitive(a);
        System.out.println("호출 후 a = " + a);
    }

    static void changePrimitive(int x) {
        x = 20;
    }

    /*기본형 : 메서드로 기본형 데이터를 전달하면, 값에 의한 복사
    메서드 내부에서 파라미터 값을 변경해도, 호출자의 변수에는 영향x
     */
}
