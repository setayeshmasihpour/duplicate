
import java.util.Scanner;

public class Main {

    public static boolean isDuplicate(String s) {

        if (s.length() == 0) {
            return true;
        }

        char first = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == first) {

                String newString = s.substring(1, i)
                        + s.substring(i + 1);

                return isDuplicate(newString);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        if (isDuplicate(s)) {
            System.out.println("Duplicate");
        } else {
            System.out.println("Not Duplicate");
        }

        input.close();
    }
}
