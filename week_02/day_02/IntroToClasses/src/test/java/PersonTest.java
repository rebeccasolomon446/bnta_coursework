import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PersonTest {
    private Person person;

    @BeforeEach
    public void setUp() {
        person = new Person("Rebecca", "London", 22)
    }

    @Test
    public void hasName() {
        assertThat(person.getName()).isEqualTo("Rebecca");

    }
}
