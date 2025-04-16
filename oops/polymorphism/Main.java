package oops.polymorphism;

public class Main {
    public static void main(String[] args){
        Shapes shape = new Shapes();
        Shapes cirle = new Circle();
        Shapes square = new Square();

        square.area();
        cirle.area();
        shape.area();
    }
}
