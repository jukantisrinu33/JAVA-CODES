//Shortest Path

public class Strings_prob2 {
    public static void main(String args[]) {
        String path = "WNEENESENNN";

        int X_axis = 0;
        int y_axis = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'W') {
                X_axis--;
            } else if (path.charAt(i) == 'S') {
                y_axis--;
            } else if (path.charAt(i) == 'N') {
                y_axis++;
            } else if (path.charAt(i) == 'E') {
                X_axis++;
            }
        }

        System.out.println(X_axis + " " + y_axis);

        System.out.println((int) Math.sqrt((int) (Math.pow(X_axis, 2)) + (int) Math.pow(y_axis, 2)));

    }
}
