package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data(); //Data 클래스 참조 변수 dataA를 선언하고 할당함.
        dataA.value = 10;
        System.out.println("호출 전 dataA.value = " + dataA.value);
        changeReference(dataA); //참조 주소를 복사하여 전달함.
        System.out.println("호출 후 dataA.value = " + dataA.value);
    }
    //매개변수로 Data 클래스 참조 변수를 넘겨줌(주소), C에서 포인터 매개변수 넘기는 것처럼!
    public static void changeReference(Data dataX){
        dataX.value = 20;
        //매서드 안에서 dataX라는 지역 변수가 태어남. 그 주소는 복사해서 받은 주소를 가짐. 그 주소의 해당하는 value 속성을 바꾼다.
    }

    /*
    참조형 : 메서드로 참조형 데이터를 전달하면, 참조에 의한 복사
    메서드 내부에서 파라미터로 전달된 객체의 멤버 변수를 변경하면, 호출자의 객체도 변경된다.
     */
}
