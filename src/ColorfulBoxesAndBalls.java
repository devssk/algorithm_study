public class ColorfulBoxesAndBalls {
    public static void main(String[] args) {
        int numRed = 9;
        int numBlue = 1;
        int onlyRed = -1;
        int onlyBlue = -10;
        int bothColors = 4;

        int maximum = getMaximum(numRed, numBlue, onlyRed, onlyBlue, bothColors);
        System.out.println("maximum = " + maximum);
    }

    public static int getMaximum(int numRed, int numBlue, int onlyRed, int onlyBlue, int bothColors) {
        int answer = 0;
        int answer2 = 0;
        boolean check = false;

        int sub = onlyRed - onlyBlue;

        if (numRed < numBlue) {
            check = true;
        }

        if (bothColors >= Math.abs(sub) && check) {
            answer2 += numRed * bothColors * 2;
            answer2 += (numBlue - numRed) * onlyBlue;
        }

        answer += numRed * onlyRed;
        answer += numBlue * onlyBlue;

        System.out.println("answer = " + answer);
        System.out.println("answer2 = " + answer2);

        return Math.max(answer, answer2);
    }
}
