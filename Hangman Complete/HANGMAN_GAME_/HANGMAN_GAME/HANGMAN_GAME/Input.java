import java.util.Scanner;

public class Input {

    private static Scanner sc = new Scanner(System.in);

    public static String getString(String msg) {
        String value = "";

        System.out.print(msg);
        value = sc.next();
        return value;
    }

    public static Integer getInteger(String msg) {
        Integer result = 0;
        System.out.print(msg);
        result = sc.nextInt();
        return result;
    }


}
