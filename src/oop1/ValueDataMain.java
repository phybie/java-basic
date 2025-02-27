package oop1;

import java.sql.SQLOutput;

public class ValueDataMain {

    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        increase(valueData);
        increase(valueData);
        increase(valueData);
        System.out.println("최종 숫자 value = " + valueData.value);
    }

    static void increase(ValueData valueData){
        valueData.value++;
        System.out.println("증가 value = " + valueData.value);
    }
}
