//convert First Letter to Upper case

public class Strings_prob3 {

    public static void main(String args[]) {
        StringBuilder sb1 = new StringBuilder("hi, i am SRINIVAS a");
        StringBuilder sb2 = new StringBuilder("");
        sb2.append((Character.toUpperCase(sb1.charAt(0))));
        for (int i = 1; i < sb1.length(); i++) {

            if (sb1.charAt(i - 1) == ' ') {

                sb2.append((Character.toUpperCase(sb1.charAt(i))));
            } else {
                sb2.append(sb1.charAt(i));
            }
        }

        System.out.print(sb2);
    }

}
