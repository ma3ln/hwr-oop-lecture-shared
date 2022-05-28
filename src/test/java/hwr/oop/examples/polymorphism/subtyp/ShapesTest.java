package hwr.oop.examples.polymorphism.subtyp;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static java.lang.Math.sin;
import static java.lang.Math.toRadians;
import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

class ShapesTest {

    @Nested
    class SquareTest {
        @Test
        void square_IsPolymorphicType() {
            Shape square = new Square(42);
            assertThat(square)
                    .isInstanceOf(Object.class)
                    .isInstanceOf(Shape.class)
                    .isInstanceOf(Quadrangle.class)
                    .isInstanceOf(Rectangles.class)
                    .isInstanceOf(Squares.class);
        }

        @Test
        void squareIsRectangle_ButRectangleIsNoSquare() {
            Shape square = new Square(42);
            Shape rectangle = new Rectangle(13, 37);
            assertThat(square).isInstanceOf(Rectangles.class);
            assertThat(rectangle).isNotInstanceOf(Squares.class);
        }

        @Test
        void square_GetPerimeterLength_IsFourTimesProvidedSize() {
            Shape square = new Square(42);
            double perimeterLength = square.getPerimeterLength();
            assertThat(perimeterLength).isEqualTo(4 * 42);
        }

        @Test
        void square_GetAreaSize_IsSideLengthSquared() {
            Shape square = new Square(42);
            double areaSize = square.getAreaSize();
            assertThat(areaSize).isEqualTo(42 * 42);
        }

        @Test
        void square_GetNumberOfSides_ReturnsFour() {
            Shape square = new Square(42);
            int numberOfSides = square.getNumberOfSides();
            assertThat(numberOfSides).isEqualTo(4);
        }
    }

    @Nested
    class RectangleTest {
        @Test
        void rectangle_IsPolymorphicType() {
            Rectangle rectangle = new Rectangle(42, 1337);
            assertThat(rectangle)
                    .isInstanceOf(Object.class)
                    .isInstanceOf(Shape.class)
                    .isInstanceOf(Quadrangle.class)
                    .isInstanceOf(Rectangle.class);
        }

        @Test
        void rectangle_GetPerimeterLength_IsFourTimesProvidedSize() {
            Shape rectangle = new Rectangle(42, 1337);
            double perimeterLength = rectangle.getPerimeterLength();
            assertThat(perimeterLength).isEqualTo(42 + 42 + 1337 + 1337);
        }

        @Test
        void rectangle_GetAreaSize_IsSideLengthSquared() {
            Shape rectangle = new Rectangle(1337, 42);
            double areaSize = rectangle.getAreaSize();
            assertThat(areaSize).isEqualTo(42 * 1337);
        }

        @Test
        void rectangle_GetNumberOfSides_ReturnsFour() {
            Shape rectangle = new Rectangle(42, 1337);
            int numberOfSides = rectangle.getNumberOfSides();
            assertThat(numberOfSides).isEqualTo(4);
        }

        @Test
        void quadrangle_comparable() {
            Comparable<Quadrangle> first = new Rectangle(1, 2);
            Comparable<Quadrangle> second = new Rectangle(1, 2);


        }

        @Test
        void raute_GetNumberOfSides_Return4() {
            Shape raute = new Raute(4,45);
            int numbOfSides = raute.getNumberOfSides();
            assertThat(numbOfSides).isEqualTo(4);
        }

        @Test
        void raute_GetAreaSize_ReturnSin45x4() {
            Shape raute = new Raute(4,45);
            double areasize = raute.getAreaSize();
            assertThat(areasize).isEqualTo(sin(toRadians(45))*4);
        }

        @Test
        void raute_GetPerimeterLength_Return4x4(){
            Shape raute = new Raute(4,45);
            double umfang = raute.getPerimeterLength();
            assertThat(umfang).isEqualTo(4*4);
        }

        @Test
        void raute_GetOtherAngels_Return135(){
            Quadrangle raute = new Raute(4,45);
            double[] otherAngel = raute.getDistinctAngles();
            assertThat(otherAngel[1]).isEqualTo(135);
        }

        @Test
        void parallelogramm_GetOtherAngels_Return135(){
            Quadrangle parallelogramm = new Parallelogramm(4,5,45);
            double[] otherAngel = parallelogramm.getDistinctAngles();
            assertThat(otherAngel[0]).isEqualTo(135);
        }

        @Test
        void parra_GetPer_18(){
            Shape para = new Parallelogramm(4,5,45);
            double a = para.getPerimeterLength();
            assertThat(a).isEqualTo(18);
        }

        @Test
        void parra_GetArea(){
            Shape para = new Parallelogramm(4,5,45);
            double a = para.getAreaSize();
            assertThat(a).isEqualTo(sin(toRadians(45))*4);
        }

        @Test
        void trapez_GetPer(){
            Shape trap = new Trapez(10,5,45,60);
            double a = trap.getPerimeterLength();
            assertThat(a).isEqualTo(21.16972052732128);
        }

        @Test
        void trapez_GetAngels(){
            Quadrangle trap = new Trapez(10,5,45,60);
            double a[] = trap.getDistinctAngles();
            assertThat(a[0]).isEqualTo(45);
            assertThat(a[1]).isEqualTo(60);
            assertThat(a[2]).isEqualTo(120);
            assertThat(a[3]).isEqualTo(135);
        }

        @Test
        void trapez_GetArea(){
            Shape trap = new Trapez(10,5,45,60);
            double a = trap.getAreaSize();
            assertThat(a).isEqualTo(27.35381642568991);
        }

        @Test
        void trapez_GetHoehe(){
            Trapez trap = new Trapez(10,5,45,60);
            double a = trap.getHoehe();
            assertThat(a).isEqualTo(4.330127018922193);
        }

        @Test
        void prar_GetHoehe(){
            Parallelogramm para = new Parallelogramm(2,4,45);
            double a = para.getHigh();
            assertThat(a).isEqualTo(sin(toRadians(45))*2/2);
        }
    }



}
