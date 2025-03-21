package az.edu.turing.module02.part01.lesson04;

class Counter2 {
    int count;
    void increment() {
        count++;
    }
}

public class Counter {

    public static void main(String[] args) {
        Counter2 c1 = new Counter2();
        Counter2 c2 = c1;
        c1.increment();
        c2.increment();
        System.out.println(c2.count);
    }
}
