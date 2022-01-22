package day2;

import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int i;
            for ( i = 2; i <= n-1; i++) {
                if (n%i == 0) {
                    System.out.println("not a prime number");
                    break;
                }
            }
            if (i == n) {
                System.out.println("prime number");
            }
        }
    }
}
