public class Function_prob4 {

    public static int binToDec(int num) {
        int number = num;
        int temp = 0;
        int remainder = 0;
        int power = 0;
        while (number > 0) {
            temp = number % 2;
            number = number / 2;
            remainder = (int) (remainder + temp * (Math.pow(10, power)));
            power++;
        }
        return remainder;
    }

    public static void main(String args[]) {
        System.out.print(binToDec(5));
    }
}
