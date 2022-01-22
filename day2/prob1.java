package day2;

import java.util.Scanner;

public class prob1 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print(i+" ");
            }
        }
    }

    @Override
    public String toString() {
        return "prob1 []";
    }
}
