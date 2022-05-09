package hwr.oop.examples.classes.comparability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

class ComparabilityTest {

    private Train first;
    private Train second;

    private Train third;

    @BeforeEach
    void setUp() {
        first = new Train(12);
        second = new Train(13);
        third =  new Train(14);
    }

    @Test
    void compareTo_threeTrainsTransitive(){
        first.accelerateTo(100);
        second.accelerateTo(90);
        third.accelerateTo(80);
        int compareToResult = first.compareTo(second);
        int compareingToResult = second.compareTo(third);
        int comparedToResult = first.compareTo(third);
        assertThat(compareToResult).isPositive().isNotZero();
        assertThat(compareingToResult).isPositive().isNotZero();
        assertThat(comparedToResult).isPositive().isNotZero();

    }

    @Test
    void comparatorCompare(){
        Comparator<Train> comparator = new RailCarComparator();
        int a = comparator.compare(first, second);
        int b = comparator.compare(second, third);
        int c = comparator.compare(first, second);
        assertThat(a).isNegative().isNotZero();
        assertThat(b).isNegative().isNotZero();
        assertThat(c).isNegative().isNotZero();
    }

    @Test
    void compareTo_FirstDrivesFasterThanSecond_FirstIsGreaterThanSecond() {
        first.accelerateTo(100);
        second.accelerateTo(90);
        int compareToResult = first.compareTo(second);
        assertThat(compareToResult).isPositive().isNotZero();
    }

    @Test
    void compareTo_FirstDrivesFasterThanSecond_SecondIsLessThanFirst() {
        first.accelerateTo(100);
        second.accelerateTo(90);
        int compareToResult = second.compareTo(first);
        assertThat(compareToResult).isNegative().isNotZero();
    }

    @Test
    void railCarComparator_compare_FirstTrainShorter_FirstLessThanSecond() {
        Comparator<Train> comparator = new RailCarComparator();
        int result = comparator.compare(first, second);
        assertThat(result).isNegative().isNotZero();
    }

    @Test
    void railCarComparator_compare_FirstTrainShorter_SecondTrainGreaterThanFirst() {
        Comparator<Train> comparator = new RailCarComparator();
        int result = comparator.compare(second, first);
        assertThat(result).isPositive().isNotZero();
    }
}
