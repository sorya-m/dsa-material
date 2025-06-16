package bit_manipulation;

public class OddOrEven {
    public static void main(String[] args) {

        //check if the given number is odd or even using & operator
        int num = 5;
        System.out.println("Input  : " + num);
        System.out.println("Output : " + (checkOddOrEven(num) ? "Odd" : "Even"));

    }

    private static boolean checkOddOrEven(int num) {
        return (num & 1) == 1;
    }


}

