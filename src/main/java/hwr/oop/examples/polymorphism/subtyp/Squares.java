package hwr.oop.examples.polymorphism.subtyp;

public interface Squares extends Rectangles, Rautes {
    static Squares create(double sideLength){
        return new Square(sideLength);
    }
}
