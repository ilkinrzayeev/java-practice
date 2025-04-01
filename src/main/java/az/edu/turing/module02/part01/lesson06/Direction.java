package az.edu.turing.module02.part01.lesson06;

enum Direction1 {
    NORTH, EAST, SOUTH, WEST
}

public class Direction {
    public static void main(String[] args) {
        System.out.println(Direction1.EAST.name());
        System.out.println(Direction1.SOUTH.ordinal());
    }
}
