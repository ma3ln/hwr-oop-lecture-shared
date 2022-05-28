package hwr.oop.examples.polymorphism.subtyp;

import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

public class Parallelogramm implements Parallelogramms {
    int a,  b, alpha;
    public Parallelogramm(int a, int b, int alpha) {
        this.a = a;
        this.b = b;
        this.alpha = alpha;
    }

    @Override
    public double[] getDistinctAngles() {
        return new double[]{180-alpha};
    }

    @Override
    public double getPerimeterLength() {
        return 2*a+2*b;
    }

    public double getHigh(){
        return sin(toRadians(alpha))*a/a;
    }

    @Override
    public double getAreaSize() {
        return sin(toRadians(alpha))*a;
    }
}
