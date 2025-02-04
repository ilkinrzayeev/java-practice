package az.edu.turing.module01.lesson01;

import java.util.Scanner;

public class SeasonsApp {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the month number (1-12): ");
            int month = scanner.nextInt();
            String season;
            switch (month) {
                case 1:
                case 2:
                case 12:
                    season = "Winter";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Spring";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Summer";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Autumn";
                    break;
                default:
                    season = "Wrong";
            }

            System.out.println("This month falls into " + season + " season.");
            scanner.close();
        }
    }

