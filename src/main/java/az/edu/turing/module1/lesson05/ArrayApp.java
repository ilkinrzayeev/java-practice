package az.edu.turing.module1.lesson05;

public class ArrayApp {

    public static void main(String[] args) {
        int[] gradesInAlphabet = {'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println(gradesInAlphabet);

        System.out.println(gradesInAlphabet.length);

        // indexed for loop
        for (int i = 0; i < gradesInAlphabet.length; i++) {
            System.out.printf("%d\t", gradesInAlphabet[i]);
        }
        System.out.println();

        //enhanced for loop
        for (int element : gradesInAlphabet) {
            System.out.printf("%d\t", element);
        }

        int[] grades = new int[5];
        grades[0] = 9;
        grades[1] = 8;
        grades[2] = 7;
        System.out.println("\n" + grades);
    }
}
