package az.edu.turing.module01.lesson02;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        {
                System.out.println("Enter a number:");
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                String result = number % 2 == 0 ? "EVEN" : "ODD";
                System.out.println(result);
            }
        }
    }

