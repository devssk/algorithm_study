public class BadNeighbors {
    public static void main(String[] args) {
        int[] donations = {94, 40, 49, 65, 21, 21, 106, 80, 92, 81, 679, 4, 61, 6, 237, 12, 72, 74,
                29, 95, 265, 35, 47, 1, 61, 397, 52, 72, 37, 51, 1, 81, 45, 435, 7, 36, 57, 86, 81, 72};

//        int[] donations = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};

        maxDonations(donations);
    }

    public static int maxDonations(int[] donations) {
        int answer = 0;

        int index = 0;
        int min = donations[0];

        for (int i = 1; i < donations.length; i++) {
            if (min > donations[i]) {
                min = donations[i];
                index = i;
            }
        }

        

        System.out.println("index : " + index + ", min : " + min);


        return answer;
    }

}
