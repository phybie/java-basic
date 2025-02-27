package class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview mv1 = new MovieReview();
        mv1.title = "인셉션";
        mv1.review = "인.생.영.화. 두 번 보고 세 번 봐도 질리지가 않아..";
        MovieReview mv2 = new MovieReview();
        mv2.title = "히말라야";
        mv2.review = "수면제 영화라 할 수 있다.. 처음으로 영화관에서 숙면한 날";

        MovieReview[] movies = new MovieReview[] {mv1, mv2};

        System.out.println("영화리뷰 모음");
        for (MovieReview m : movies) {
            System.out.println("|영화 제목|: " + m.title + "  |한 줄 평|: " + m.review);
        }
    }
}
