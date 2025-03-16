package sample;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       
    int[] a;
    int n;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter array");
    
		n = in.nextInt();
        a = new int [n];
        for (int i = 0; i < n; i++) {
            System.err.print("Enter a[" + i + "] =");
            a[i] = in.nextInt();
        }
    }
}
