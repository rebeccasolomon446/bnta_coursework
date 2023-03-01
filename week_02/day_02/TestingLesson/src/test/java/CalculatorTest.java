import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {

    private Calculator  calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculator();

    }

    @Test
    public void testAdd() {

        assertThat(calc.add(4, 4)).isEqualTo(8);




    }

    @Test
    public void testSubtract() {

        assertThat(calc.subtract(10, 3)).isEqualTo(7);

    }

    @Test
    public void testMultiply() {

        assertThat(calc.multiply(10, 5)).isEqualTo(50);

    }

    @Test
    public void testDivide() {

        assertThat(calc.divide(50.0, 10.0)).isEqualTo(5.0);

    }






}
