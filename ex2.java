package bai27.pkg8;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang (n): ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhap phan tu mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhạp phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]); 
        }

        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
    }
}