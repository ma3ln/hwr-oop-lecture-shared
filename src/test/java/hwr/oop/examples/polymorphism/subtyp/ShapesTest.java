package hwr.oop.examples.polymorphism.subtyp;

import org.assertj.core.api.Assertions;
import org.assertj.core.internal.IterableElementComparisonStrategy;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static java.lang.Math.sin;
import static java.lang.Math.toRadians;
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
                    .isInstanceOf(Rectangle.class)
                    .isInstanceOf(Square.class);
        }

        @Test
        void squareIsRectangle_ButRectangleIsNoSquare() {
            Shape square = new Square(42);
            Shape rectangle = new Rectangle(13, 37);
            assertThat(square).isInstanceOf(Rectangle.class);
            assertThat(rectangle).isNotInstanceOf(Square.class);
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
    }


}
