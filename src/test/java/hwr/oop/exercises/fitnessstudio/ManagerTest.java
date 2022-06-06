package hwr.oop.exercises.fitnessstudio;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ManagerTest {


    @Test
    void managerName(){
        Personal manager = new Manager("Stephan");
        String name = manager.getName();
        assertThat(name).isEqualTo("Stephan");
    }

    @Test
    void managerBestellung(){
        Manager manager = new Manager("Stephan");
        Equipment hantelbank = (Equipment) manager.buy("Hantelbank"); //cast wegbekommen?
        double squareMeters = hantelbank.getSquareMeters();
        assertThat(squareMeters).isEqualTo(3);
    }

    @Test
    void managerEquipmentArea(){
        Manager manager = new Manager("Stephan");
        Equipment hantelbank = (Equipment) manager.buy("Hantelbank");//cast wegbekommen?
        Area trainingsraum = new Trainingsraum(30);
        double squareMeters = trainingsraum.getSquareMeters();
        assertThat(squareMeters).isEqualTo(30);
        double squareMetersHantelbank = hantelbank.getSquareMeters();
        assertThat(squareMetersHantelbank).isEqualTo(3);
        manager.addEquipment(trainingsraum,hantelbank);
        Equipment equipment[] = trainingsraum.getList();
        assertThat(equipment[0]).isEqualTo(hantelbank);
    }
}
