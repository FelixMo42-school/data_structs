import java.util.Arrays;
import java.util.Stack;

public class StackDemo {
    public static void main(String args[]) {
        int arr[] = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100) + 1;
        }

        Arrays.sort(arr);

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < arr.length; i++) {
            stack.push( arr[i] );
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        System.out.println( Arrays.toString(arr) );
    }
}
