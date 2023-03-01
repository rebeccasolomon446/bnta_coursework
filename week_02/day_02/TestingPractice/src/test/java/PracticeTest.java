import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PracticeTest {

    @Test                        //@Test tells JUnit to run the method below as a test
    void myFirstTest() {
        //givem:
        String input ="HELLO";
        //when:
        String actual = input.toLowerCase();
        //then:
        String expected = "hello";
        assertThat(actual).isEqualTo(expected);


    }
}
