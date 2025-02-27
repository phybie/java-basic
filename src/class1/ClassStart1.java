package class1;

public class ClassStart1 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrade = {90, 80};

        for (int i = 0; i < studentNames.length; i++){
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrade[i])
            ;
        }

        //학생 1의 점수만을 제거하면? -> 제거 오류 발생!!!
        //데이터베이스로 치면! 스키마의 속성 간의 함수적 종속성이 존재함.. 학생의 이름이 결정되면, 나이와 성적이 결정됨... 정규화 문제발생
    }
}
