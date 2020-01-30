import java.util.Arrays;

// NOT AN ABSTRACT DATA STRUCTURE, ITS A CONCRETE DATA STRUCTURE

public class Array2dDemo {
    public static void main(String args[]) {
        int arr[][] = new int[5][5];

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                arr[x][y] = (int)(Math.random() * 50) + 1;
            }
        }

        int max[] = {0, 0, 0};

        for (int x = 1; x < 4; x++) {
            for (int y = 1; y < 4; y++) {
                int val = arr[x - 1][y] + arr[x + 1][y] + arr[x][y + 1] + arr[x][y - 1] + arr[x][y];

                if (val > max[0]) {
                    max[0] = val;
                    max[1] = x;
                    max[2] = y;
                }
            }
        }

        System.out.print("largest: ");
        System.out.print(max[0]);
        System.out.print(", ");
        System.out.print(max[1]);
    }
}
