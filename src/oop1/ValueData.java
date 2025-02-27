package oop1;

public class ValueData {
    int value;

    void increase(){
        //메서드는 객체를 생성해야 호출할 수 있다.
        // static을 붙이지 않음: static은 객체를 생성하지 않고 메서드를 호출할 수 있는 것.
        value++;
        System.out.println("숫자 증가 value = " + value);
    }

    //클래스 안에 데이터인 value와 해당 값을 증가시키는 메서드가 함께 정의되어있다.
}
