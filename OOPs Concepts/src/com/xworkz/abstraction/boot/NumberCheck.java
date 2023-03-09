package com.xworkz.abstraction.boot;
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        if (num % 2 == 0) { // even number
            int nextEven = num + 2;
            System.out.println("Next even number square: " + (nextEven * nextEven));
        } else if (isPrime(num)) { // prime number
            System.out.println("Square of the number: " + (num * num));
        } else { // odd number
            int nextOdd = num + 2;
            System.out.println("Next odd number cube: " + (nextOdd * nextOdd * nextOdd));
        }
    }
    
    // method to check whether a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

