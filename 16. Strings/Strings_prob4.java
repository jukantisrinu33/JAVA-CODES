//compress a String
public class Strings_prob4 {

    public static void main(String args[]) {
        String str = new String("abbcccddd");
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            int counter = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                counter++;
                i++;
            }
            sb.append(str.charAt(i));
            if (counter > 1) {
                sb.append(counter);
            }

        }

        System.out.println(sb);

    }

}
