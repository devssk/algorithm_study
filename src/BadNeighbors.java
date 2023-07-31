public class BadNeighbors {
    public static void main(String[] args) {
        int[] donations = {94, 40, 49, 65, 21, 21, 106, 80, 92, 81, 679, 4, 61, 6, 237, 12, 72, 74,
                29, 95, 265, 35, 47, 1, 61, 397, 52, 72, 37, 51, 1, 81, 45, 435, 7, 36, 57, 86, 81, 72};

//        int[] donations = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};

        maxDonations(donations);
    }

    public static int maxDonations(int[] donations) {
        int answer = 0;

        boolean[] check = new boolean[donations.length];

        int maxIndex = 0;
        int minIndex = 0;
        int max = donations[0];
        int min = donations[0];

        for (int i = 1; i < donations.length; i++) {
            if (min > donations[i]) {
                min = donations[i];
                minIndex = i;
            }
            if (max < donations[i]) {
                if (i != (donations.length - 1)) {
                    int maxTemp = donations[i];
                    int before = donations[i - 1];
                    int after = donations[i + 1];
                    if (maxTemp >= (before + after)) {
                        max = donations[i];
                        maxIndex = i;
                        check[i] = true;
                    } else {
                        max = donations[i - 1];
                        maxIndex = i - 1;
                        check[i - 1] = true;
                        check[i + 1] = true;
                    }
                }
            }
        }

        System.out.println("max index : " + maxIndex + ", max : " + max);
        System.out.println("min index : " + minIndex + ", min : " + min);

        for (int i = maxIndex; i < donations.length; i++) {

        }

        return answer;
    }

}
