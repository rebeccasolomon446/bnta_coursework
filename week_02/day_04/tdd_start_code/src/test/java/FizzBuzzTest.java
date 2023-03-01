import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp(){

        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void canReturnFizz(){

        String result = fizzBuzz.getFizzBuzz(3);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void canGetFizz() {
        String result = fizzBuzz.getFizzBuzz(5);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void canGetFizzBuzz() {
        String result = fizzBuzz.getFizzBuzz(15);
        assertThat(result).isEqualTo("FizzBuzz");

    }

    @Test
    public void returns_Number_As_String_If_Divisible_By_Neither() {
        String result = fizzBuzz.getFizzBuzz(4);
        assertThat(result).isEqualTo("4");
    }


}
