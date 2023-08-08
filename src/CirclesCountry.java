public class CirclesCountry {
    public static void main(String[] args) {
        int x = 102;
        int y = 16;
    }

    public static int leastBorders(int[] X, int[] Y, int[] R, int x1, int y1, int x2, int y2) {
        int answer = 0;

        for (int i = 0; i < X.length; i++) {
            int circleX = X[i];
            int circleY = Y[i];
            int circleR = R[i];
            if (checkCircle(circleX, circleY, circleR, x1, y1)) {
                answer++;
            }
            if (checkCircle(circleX, circleY, circleR, x2, y2)) {
                answer++;
            }
        }

        return answer;
    }

    public static boolean checkCircle(int circleX, int circleY, int circleR, int x, int y) {
        boolean check = false;

        double distance = Math.sqrt((x - circleX) * (x - circleX) + (y - circleY) * (y - circleY));
        if (distance <= circleR) {
            check = true;
        }

        return check;
    }

}
