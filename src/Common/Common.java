package Common;

import java.util.Scanner;

public class Common {

    static Scanner scanner = new Scanner(System.in);

    public static int nextInt(String text) {
        return Integer.parseInt(nextLine(text));
    }
    public static int nextInt(String text,int from , int to) {
        int val = Integer.parseInt(nextLine(text));
        return val;
    }

    public static String nextLine(String text) {
        System.out.println(text);
        return scanner.nextLine();
    }
    public static String nextLine(String text, int from) {

        return text;
    }
}