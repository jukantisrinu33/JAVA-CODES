//Binary to Decimal
public class Function_prob3 {
    public static int binToDec(int num) {
        int power = 0;
        int number = num;
        int temp = 0;
        int Decimal = 0;
        while (number > 0) {
            temp = number % 10;
            number = number / 10;
            Decimal = (int) (Decimal + temp * (Math.pow(2, power)));
            power++;
        }
        return Decimal;
    }

    public static void main(String args[]) {
        System.out.print(binToDec(1001));
    }
}
