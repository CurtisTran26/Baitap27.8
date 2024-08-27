
package bai27.pkg8;

import java.util.Arrays;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu mang: ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Mang sau khi sap xep tang dan:");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
