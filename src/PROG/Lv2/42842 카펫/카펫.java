public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;


        for (int h = 1; h <= Math.sqrt(yellow); h++) {
            if (yellow % h == 0) {
                int w = yellow / h;
                int W = w + 2;
                int H = h + 2;

                if (W >= H && W * H == total) {
                    return new int[] { W, H };
                }
            }
        }

        return new int[] {};
    }
}