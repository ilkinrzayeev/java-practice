package az.edu.turing.module02.part02.lesson08;

public class GenericBoxDemo {

    public static void main(String[] args) {
        Box<Integer> box = new Box<>(5);
        Box<Double> box2 = new Box<>(5.3);
        System.out.println(box.getData() + box2.getData());
    }
}

class Box<E> {
    E data;

    public Box(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }
}

