import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberMagicEasy {
    public static void main(String[] args) {
        String answer = "YYYY";

        theNumber(answer);

        int[] card1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] card2 = {1, 2, 3, 4, 9, 10, 11, 12};
        int[] card3 = {1, 2, 5, 6, 9, 10, 13, 14};
        int[] card4 = {1, 3, 5, 7 ,9, 11, 13 ,15};

        int[][] cardList = new int[4][8];
        cardList[0] = card1;
        cardList[1] = card2;
        cardList[2] = card3;
        cardList[3] = card4;

        List<Integer> tempList = new ArrayList<>();

        String[] split = answer.split("");


    }

    public static int theNumber(String answer) {
        int result = 0;

        int[] card1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] card2 = {1, 2, 3, 4, 9, 10, 11, 12};
        int[] card3 = {1, 2, 5, 6, 9, 10, 13, 14};
        int[] card4 = {1, 3, 5, 7 ,9, 11, 13 ,15};

        int[][] cardList = new int[4][8];
        cardList[0] = card1;
        cardList[1] = card2;
        cardList[2] = card3;
        cardList[3] = card4;

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 17; i++) {
            list.add(i);
        }
        String[] split = answer.split("");
        for (int i = 0; i < split.length; i++) {
            String checkYn = split[i];
            if ("Y".equals(checkYn)) {
                int[] card = cardList[i];

                List<Integer> copyCard = new ArrayList<>();
                for (int number : card) {
                    copyCard.add(number);
                }

                List<Integer> removeIndexList = new ArrayList<>();
                for (int j = 0; j < list.size(); j++) {
                    int tempNumber = list.get(j);
                    for (int k = 0; k < copyCard.size(); k++ ) {
                        int cardNumber = copyCard.get(k);
                        if (tempNumber == cardNumber) {
                            copyCard.remove(k);
                            break;
                        }
                        if (tempNumber != cardNumber) {

                        }

                    }
                }
//                for (int j = 0; j < card.length; j++) {
//                    int cardNumber = card[j];
//                    for (; k < list.size(); k++) {
//                        int tempNumber = list.get(k);
//                        if (cardNumber == tempNumber) {
//                            k = tempNumber;
//                            break;
//                        }
//                        if (cardNumber != tempNumber) {
//                            removeIndexList.add(k);
//                        }
//                    }
//                }
                for (int removeIndex : removeIndexList) {
                    list.remove(removeIndex);
                }
            }
            if ("N".equals(checkYn)) {
                int[] card = cardList[i];
                for (int j = 0; j < card.length; j++) {
                    int cardNumber = card[j];
                    for (int k = 0; k < list.size(); k++) {
                        int tempNumber = list.get(k);
                        int index = -1;
                        if (cardNumber == tempNumber) {
                            index = k;
                        }
                        if (index != -1) {
                            list.remove(index);
                        }
                    }
                }
            }
        }

        System.out.println(list);
        if (list.size() > 0) {
            result = list.get(0);
        }

        return result;
    }

    public static int theNumber2(String answer) {
        int result = 0;

        int[] card1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] card2 = {1, 2, 3, 4, 9, 10, 11, 12};
        int[] card3 = {1, 2, 5, 6, 9, 10, 13, 14};
        int[] card4 = {1, 3, 5, 7 ,9, 11, 13 ,15};

        int[][] cardList = new int[4][8];
        cardList[0] = card1;
        cardList[1] = card2;
        cardList[2] = card3;
        cardList[3] = card4;

        boolean[] check = new boolean[16];

        String[] split = answer.split("");
        for (int i = 0; i < split.length; i++) {
            String checkYn = split[i];
            if ("Y".equals(checkYn)) {
                int[] card = cardList[i];
                for (int cardNumber : card) {
                    check[cardNumber - 1] = true;
                }
            }
            if ("N".equals(checkYn)) {
                int[] card = cardList[i];
                for (int cardNumber : card) {
                    check[cardNumber - 1] = false;
                }
            }
        }

        

        System.out.println(Arrays.toString(check));

        return result;
    }
}
