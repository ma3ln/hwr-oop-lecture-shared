package hwr.oop.exercises.fitnessstudio;

import org.w3c.dom.html.HTMLDListElement;

import java.util.ArrayList;
import java.util.List;

public class Trainingsraum implements Area {
    private final int squareMeters;
    List list = new ArrayList<>();

    public Trainingsraum(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    @Override
    public double getSquareMeters() {
        return squareMeters;
    }

    @Override
    public void addList(Equipment hantelbank) {
        list.add(hantelbank);
    }

    @Override
    public Equipment[] getList() {
        return (Equipment[]) list.toArray();
    }
}
