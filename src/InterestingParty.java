import java.util.HashMap;
import java.util.Map;

public class InterestingParty {
    public static void main(String[] args) {

        String[] first = {"fishing", "gardening", "swimming", "fishing"};
        String[] second = {"hunting", "fishing", "fishing", "biting"};


        bestInvitation(first, second);
    }

    public static int bestInvitation(String[] first, String[] second) {
        int answer = 0;

        for(int i = 0; i < first.length; i++) {
            int f = 0;
            int s = 0;
            for (int j = 0; j < first.length; j++) {
                if (first[i].equals(first[j])) {
                    f++;
                    System.out.println("i : " + i + ", j : " + j + " " + first[i] + "가 " + first[j] + "와 일치" + " f++");
                }
                if (first[i].equals(second[j])) {
                    f++;
                    System.out.println("i : " + i + ", j : " + j + " " + first[i] + "가 " + second[j] + "와 일치" + " f++");
                }
                if (second[i].equals(first[j])) {
                    s++;
                    System.out.println("i : " + i + ", j : " + j + " " + second[i] + "가 " + first[j] + "와 일치" + " s++");
                }
                if (second[i].equals(second[j])) {
                    s++;
                    System.out.println("i : " + i + ", j : " + j + " " + second[i] + "가 " + second[j] + "와 일치" + " s++");
                }
            }
            answer = Math.max(f, answer);
            answer = Math.max(s, answer);

            System.out.println("answer : " + answer);
        }

        return answer;
    }

    public static int bestinvitation2(String[] first, String[] second) {
        int answer = 0;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < first.length; i++) {
            String topic1 = first[i];
            String topic2 = second[i];
            map.put(topic1, 0);
            map.put(topic2, 0);
        }

        for (int i = 0; i < first.length; i++) {
            map.put(first[i], map.get(first[i]) + 1);
        }

        return answer;
    }
}
