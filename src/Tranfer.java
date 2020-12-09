import java.util.Scanner;

public class Tranfer {
    public static void main(String[] args) {
        int rate = 23000;
        int usd;
        System.out.println("Enter your USD:");
        Scanner scanner = new Scanner(System.in);
        do {
            usd = scanner.nextInt();
            int vnd = usd * rate;
            System.out.println("VND is :" + vnd);
        } while (usd >0);

    }
}
