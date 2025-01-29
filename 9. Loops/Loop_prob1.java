public class Loop_prob1 {
    public static void main(String args[]) {
        int num = 10899;
        int reverse = 0;
        while (num > 0) {
            int temp = num % 10;
            num = num / 10;
            reverse = reverse * 10 + temp;
        }
        System.out.println(reverse);
    }
}