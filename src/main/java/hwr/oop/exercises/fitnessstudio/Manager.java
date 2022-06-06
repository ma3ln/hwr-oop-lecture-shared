package hwr.oop.exercises.fitnessstudio;

public class Manager implements Personal {
    private final String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    Object buy(String equipmentName) {

        if(equipmentName == "Hantelbank") {
            Equipment equipment = new Hantelbank();
            return equipment;
        }

        return null;
    }

    public void addEquipment(Area trainingsraum, Equipment hantelbank) {
        if(trainingsraum.getSquareMeters() >= 3){
            trainingsraum.addList(hantelbank);
        }
    }
}
