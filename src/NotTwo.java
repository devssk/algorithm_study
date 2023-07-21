import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotTwo {
    /*
      1 <= width <= 1000
      1 <= height <= 1000
     */
    public static void main(String[] args) {
        int width = 100;
        int height = 100;
        System.out.println("result : " + maxStones(width, height));
    }

    public static int maxStones(int width, int height) {
        int result = 0;

        int[][] board = new int[height][width];

        for (int i = 0; i < board.length; i++) {
            int[] ints = board[i];
            for (int j = 0; j < ints.length; j++) {
                if (i == 0) {
                    if (j == 0) {
                        ints[j] = 1;
                        continue;
                    }
                    if (j == 1) {
                        ints[j] = 1;
                        continue;
                    }
                    if ((ints[j - 1] == 0 || ints[j - 1] == 1) && ints[j - 2] == 0) {
                        ints[j] = 1;
                    }
                } else if (i == 1) {
                    if (j == 0) {
                        ints[j] = 0;
                        if (width < 3) {
                            ints[j] = 1;
                        }
                        continue;
                    }
                    if (j == 1) {
                        ints[j] = 1;
                        continue;
                    }
                    if ((ints[j - 1] == 0 || ints[j - 1] == 1) && ints[j - 2] == 0) {
                        ints[j] = 1;
                    }
                } else {
                    if (j == 0) {
                        if ((board[i - 1][0] == 0 || board[i - 1][0] == 1) && board[i - 2][0] == 0) {
                            ints[j] = 1;
                        }
                        continue;
                    }
                    if (j == 1) {
                        if ((board[i - 1][1] == 0 || board[i - 1][1] == 1) && board[i - 2][1] == 0) {
                            ints[j] = 1;
                        }
                        continue;
                    }
                    if ((ints[j - 1] == 0 || ints[j - 1] == 1) && ints[j - 2] == 0) {
                        ints[j] = 1;
                    }
                }
            }
            result += Arrays.stream(ints).sum();
        }

        for (int[] ints : board) {
            System.out.println(Arrays.toString(ints));
        }

        return result;
    }
}