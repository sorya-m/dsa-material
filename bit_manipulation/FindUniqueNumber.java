package bit_manipulation;

import java.util.Arrays;

public class FindUniqueNumber {
    public static void main(String[] args) {

        //find the unique number using XOR operator for only two duplicate number exists
        int[] arr = {1, 2, 3, 4, 1, 2, 3, 5, 5};
        System.out.print("Input  : ");
        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println("Output : " + getUniqueNumber(arr));
    }

    private static int getUniqueNumber(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }
}