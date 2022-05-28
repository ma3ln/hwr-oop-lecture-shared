package hwr.oop.examples.polymorphism.subtyp;

class Square implements Squares {
    double sideLength;
    Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double[] getDistinctAngles() {
        return new double[]{90};
    }

    @Override
    public double getPerimeterLength() {
        return sideLength*4;
    }

    @Override
    public double getAreaSize() {
        return sideLength*sideLength;
    }
}
