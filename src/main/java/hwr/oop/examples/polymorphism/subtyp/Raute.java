package hwr.oop.examples.polymorphism.subtyp;

import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

public class Raute implements Rautes {
    private int seitenlaenge;
    private int alpha;
    Raute(int seitenlaenge, int alpha){
        this.seitenlaenge = seitenlaenge;
        this.alpha = alpha;
    }

    @Override
    public double[] getDistinctAngles() {
        double[] a = new double[4];
        a[0] = alpha;
        a[1] = (360-alpha*2)/2;
        a[2] = alpha;
        a[3] = (360-alpha*2)/2;
        return a;
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
