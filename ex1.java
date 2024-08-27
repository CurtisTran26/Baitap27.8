package bai27.pkg8;
import java.util.Random;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String check;

        do {
            int n = random.nextInt(100) + 1; 
            System.out.print("Nhap check(yes de tiep tuc): ");
            check = scanner.nextLine();

            if (!check.equals("yes")) {
                if (n % 2 == 0) {
                    System.out.println(n + " la so chan");
                } else {
                    System.out.println(n + " la so le");
                }
            } else {
                if (n % 2 == 0) {
                    System.out.println(n + " la so chan");
                } else {
                    System.out.println(n + " la so le");
                }
                break;
            }
        } while (true);
    }
}