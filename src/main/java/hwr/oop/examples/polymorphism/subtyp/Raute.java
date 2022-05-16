package hwr.oop.examples.polymorphism.subtyp;

import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

public class Raute implements Quadrangle {
    private int seitenlaenge;
    private int alpha;
    Raute(int seitenlaenge, int alpha){
        this.seitenlaenge = seitenlaenge;
        this.alpha = alpha;
    }

    @Override
    public double[] getDistinctAngles() {
        return new double[0];
    }

    @Override
    public double getPerimeterLength() {
        return seitenlaenge*4;
    }

    @Override
    public double getAreaSize() {
        return sin(toRadians(alpha))*seitenlaenge;
    }
}
