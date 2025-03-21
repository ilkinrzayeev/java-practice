package az.edu.turing.module02.part01.lesson04;

class CounterMachine2 {
    int count;
    CounterMachine2() {
        count = 0;
    }
    CounterMachine2(int c) {
        count = c;
    }
}

public class CounterMachine {

    public static void main(String[] args) {
        CounterMachine2 c1 = new CounterMachine2();
        CounterMachine2 c2 = new CounterMachine2(5);
        System.out.println(c1.count + " " +  c2.count);
    }
}
