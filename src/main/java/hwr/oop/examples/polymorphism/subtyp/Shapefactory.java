package hwr.oop.examples.polymorphism.subtyp;

public class Shapefactory {


    Shape getShapes(int ab){
        return Squares.create(ab);
    }
}
