package az.edu.turing.module02.part01.lesson04;

class Book2 {
    static int counter;
    Book2() {
        counter+=2;
    }
}

public class Book {

    public static void main(String[] args) {
        Book2 b1 = new Book2();
        Book2 b2 = new Book2();

        System.out.println(Book2.counter);
    }
}
