package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        //bigData의 멤버 변수 중 data가 null임.
        bigData.data = new Data();
        System.out.println("bigData.count= " + bigData.count);
        System.out.println("bigData.data= " + bigData.data);

        //NullPointerException
        System.out.println("bigData.data.value" + bigData.data.value);
    }
}
