package oop1;

public class ValueObjectMain {

    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.increase();// 인스턴스의 메서드 호출 -> 가서 자기 자신의 value를 증가시킴.
        valueData.increase();
        valueData.increase();
        System.out.println("최종 숫자 value = " + valueData.value);
    }
}
