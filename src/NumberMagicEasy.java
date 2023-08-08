import java.util.HashSet;
import java.util.Set;

public class NumberMagicEasy {
    public static void main(String[] args) {
        String answer = "YNYY";

        theNumber(answer);

    }

    public static int theNumber(String answer) {
        int result = 0;

        int[] card1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] card2 = {1, 2, 3, 4, 9, 10, 11, 12};
        int[] card3 = {1, 2, 5, 6, 9, 10, 13, 14};
        int[] card4 = {1, 3, 5, 7 ,9, 11, 13 ,15};

        int[][] list = new int[4][8];
        list[0] = card1;
        list[1] = card2;
        list[2] = card3;
        list[3] = card4;

        Set<Integer> set = new HashSet<>();
        String[] split = answer.split("");
        for (int i = 0; i < split.length; i++) {
            String check = split[i];
            if ("Y".equals(check)) {
                int[] ints = list[i];
                for (int anInt : ints) {
                    set.add(anInt);
                }
            } else if ("N".equals(check)) {
                int[] ints = list[i];
                for (int anInt : ints) {
                    set.remove(anInt);
                }
            }
            System.out.println("set = " + set);
        }

        System.out.println("set = " + set);

        return result;
    }
}
