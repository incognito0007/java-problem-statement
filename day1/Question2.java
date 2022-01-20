package day1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
        try (Scanner sc = new Scanner(System.in)) {
            float r = sc.nextFloat();
            float a = (float) (3.14 * r *r);
            System.out.println(a);
        }
    }
}
