package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        //대원칙 자바는 항상 변수의 값을 복사해서 전달한다.

        Data dataB = new Data();
        dataB = dataA; // dataA.value 가 아닌 참조값을 복사해서 대입

        System.out.println("dataA 참조값 : " + dataA);
        System.out.println("dataB 참조값 : " + dataB);
        System.out.println("dataA.value : " + dataA.value);
        System.out.println("dataB.value : " + dataB.value);

        //dataA 변경
        dataA.value = 20;
        System.out.println("dataA 참조값 : " + dataA);
        System.out.println("dataB 참조값 : " + dataB);
        System.out.println("dataA.value : " + dataA.value);
        System.out.println("dataB.value : " + dataB.value);

        //dataB 변경
        dataB.value = 300;
        System.out.println("dataA 참조값 : " + dataA);
        System.out.println("dataB 참조값 : " + dataB);
        System.out.println("dataA.value : " + dataA.value);
        System.out.println("dataB.value : " + dataB.value);
    }
}
