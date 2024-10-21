package az.edu.turing.module1.lesson04;

public class SimpleDivisorsOfANumber {

        public static void main(String[] args) {
            int number = 14;
            System.out.print("Prime divisors of " + number + " are: ");

            for (int i = 2; i <= number; i++) {
                if (number % i == 0 && isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }

        // Method to check if a number is prime
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


