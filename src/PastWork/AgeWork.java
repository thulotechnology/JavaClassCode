package PastWork;

import java.util.Scanner;
public class AgeWork {
    public static void main(String[] args) {
        // Create object of scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        int birthYear = 2022-age;

        System.out.println("Your birth year is: "+birthYear);


    }
}
