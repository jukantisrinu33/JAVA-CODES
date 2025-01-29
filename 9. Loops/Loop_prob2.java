import java.util.*;

public class Loop_prob2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            if (num % 10 == 0) {
                break;
            } else {
                System.out.println(num);
            }
        }
        System.out.println("you enterd multiple of 10");
        sc.close();

    }

}
