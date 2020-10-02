import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] sk = s.split(" ");
        System.out.println(Integer.parseInt(sk[0]) + Integer.parseInt(sk[1]));
    }
}
