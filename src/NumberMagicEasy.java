import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberMagicEasy {
    public static void main(String[] args) {
        String answer = "YNYY";

        int i = theNumber(answer);
        System.out.println("i = " + i);

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

        List<Integer> temp = new ArrayList<>();
        boolean tempCheck = false;

        String[] split = answer.split("");
        for (int i = 0; i < split.length; i++) {
            String check = split[i];
            if ("Y".equals(check)) {
                int[] ints = list[i];
                if (!tempCheck) {
                    for (int anInt : ints) {
                        temp.add(anInt);
                    }
                    tempCheck = true;
                    continue;
                }
                for (int j = 0; j < temp.size(); j++) {
                    int tempInt = temp.get(j);
                    boolean cardCheck = false;
                    for (int k = 0; k < ints.length; k++) {
                        int cardInt = ints[k];
                        if (tempInt == cardInt) {
                            cardCheck = true;
                        }
                    }
                    if (!cardCheck) {
                        temp.remove(j);
                    }
                }
            } else if ("N".equals(check)) {
                if (!tempCheck) {
                    continue;
                }
                int[] ints = list[i];
                for (int j = 0; j < temp.size(); j++) {
                    int tempInt = temp.get(j);
                    boolean cardCheck = false;
                    for (int k = 0; k < ints.length; k++) {
                        int cardInt = ints[k];
                        if (tempInt == cardInt) {
                            cardCheck = true;
                        }
                    }
                    if (cardCheck) {
                        temp.remove(j);
                    }
                }
            }
            System.out.println("Index : " + i + ", " + temp);
        }

        System.out.println(temp);

        if (temp.size() > 0) {
            result = temp.get(0);
        } else {
            result = 16;
        }

        return result;
    }
}
