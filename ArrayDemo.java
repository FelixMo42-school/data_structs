import java.util.*;

class ArrayDemo {
    public static void main(String args[]) {
        int arr1[] = new int[3];
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        for (int i = 0; i < 3; i++) {
            arr1[i] = i;
            arr2.add(i);
        }

        System.out.println( Arrays.toString(arr1) );

        System.out.print("[");
        for (int val : arr2) {
            System.out.print(val);
            System.out.print(", ");
        }
        System.out.print("]");
    }
}