package hwr.oop.examples.polymorphism.subtyp;

import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

public class Trapez implements Trapezs {
    double a,b,c,d,alpha,beta,gamma,delta;
    public Trapez(double a, double b, double alpha, double beta) {
        this.a = a;
        this.b = b;
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double getPerimeterLength() {
        double[] angels = new double[4];
        angels = getDistinctAngles();
        gamma = angels[2];
        delta = angels[3];
        d = sin(toRadians(delta))*b;
        c = (a*sin(toRadians(alpha))-b*sin(toRadians(180-alpha-beta)))/sin(alpha);
        return a+b+c+d;
    }

    @Override
    public double getAreaSize() {
        c = (a*sin(toRadians(alpha))-b*sin(toRadians(180-alpha-beta)))/sin(alpha);
        double h;
        h = b*sin(toRadians(beta));
        return (a*h+c*h)/2;
    }

    public double getHoehe(){
        return b*sin(toRadians(beta));
    }

    @Override
    public double[] getDistinctAngles() {
        double[] a = new double[4];
        a[0] = alpha;
        a[1] = beta;
        a[2] = 180-beta;
        a[3] = 180-alpha;
        return a;
    }
}
