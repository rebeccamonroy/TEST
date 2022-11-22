import java.util.Scanner;

public class Terminal {

    private static Scanner scanner = new Scanner(System.in);

    public static String getString(String message){
        String res = "";
        System.out.println(message);
        res = scanner.nextLine();
        return res;
    }
    
    
    public static int getInteger(String string){
        int res = 0;
        System.out.println(string);
        res = scanner.nextInt();
        return res;
    }
}
