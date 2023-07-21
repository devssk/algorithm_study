import java.util.Arrays;

public class KiwiJuice {
    /*
     병의 용량, 2 <= capacities.length <= 50, 1 <= capacities[i] <= 1000000
     int[] capacities = {};

     주스의 양, capacities.length == bottles.length, bottles[i] <= capacities[i]
     int[] bottles = {};

     1 <= fromId.length <= 50 이동을 하려는 주스의 위치
     int[] fromId = {};

     fromId.length == toId.length 이동이 되는 주스의 위치
     int[] toId = {};
    */
    public static void main(String[] args) {
        int[] capacities = {20, 15, 8, 4, 2, 7};
        int[] bottles = {8, 0, 8, 0, 1, 6};
        int[] fromId = {0, 2, 3, 5};
        int[] toId = {2, 0, 1, 4};
        int[] result = thePouring(capacities, bottles, fromId, toId);

        System.out.println(Arrays.toString(result));
    }

    public static int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
        int[] result = Arrays.copyOf(bottles, bottles.length);
        for (int i = 0; i < fromId.length; i++) {
            int fromIndex = fromId[i];
            int toIndex = toId[i];

            int fromJuice = bottles[fromIndex];

            int toCapacity = capacities[toIndex];
            int toJuice = bottles[toIndex];

            if (toCapacity == toJuice) {
                continue;
            }

            int totalJuice = fromJuice + toJuice;

            if (totalJuice > toCapacity) {
                result[fromIndex] = totalJuice - toCapacity;
                result[toIndex] = toCapacity;
            } else {
                result[fromIndex] = 0;
                result[toIndex] = totalJuice;
            }
        }

        return result;
    }
}
