import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChickenTest {

    Chicken ginger;

    @BeforeEach
    public void setUp() {
        ginger = new Chicken("Ginger", 3);
    }

    @Test
    public void hasName() {
        // Arrange - do any setup for our test
        // Act - do the thing we're testing (should only be testing one thing per unit test. anything more can impact the test validity).
        String name = ginger.getName();
        // Assert - check that it happened correctly
        assertThat(name).isEqualTo("Ginger");
    }

    @Test
    public void hasEggs() {
        //Arrange
        // Act
        int eggs = ginger.getEggs();
        // Assert
        assertThat(eggs).isEqualTo(3);
    }

    @Test
            public void canSetEggs() {
        // Arrange
        // Act
        ginger.setEggs(5);
        // Assert
        int updatedEggs = ginger.getEggs();
        assertThat(updatedEggs).isEqualTo(5);
    }

    @Test
    public void canSetName() {
        ginger.setName("lucy");
        String updatedName = ginger.getName();
        assertThat(updatedName).isEqualTo("lucy");
    }


}
