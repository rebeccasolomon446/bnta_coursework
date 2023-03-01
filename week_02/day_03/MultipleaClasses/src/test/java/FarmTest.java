import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FarmTest {

    private Farm farm;

    @BeforeEach
    public void setUp() {
        farm = new Farm("Rebs Farm");
    }

    @Test
    public void canCountChicken() {
        // Act
        int chickenCount = farm.getChickenCount();
        // Assert
        assertThat(chickenCount).isEqualTo(0);
    }

     @Test
             public void canAddChicken() {
         // Arrange need a chicken before i actually add a chicken
         Chicken ginger = new Chicken("ginger", 3);
         // Act
         farm.addChicken(ginger);
         // Assertion
         int chickenCount = farm.getChickenCount();
         assertThat(chickenCount).isEqualTo(1);
     }

}
