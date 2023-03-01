import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FarmerTest {

    private Farmer farmer;
    private Farm farm;

        @BeforeEach
        public void setUp() {
            farmer = new Farmer("colin");
            farm = new Farm("farmname");
        }

        @Test
        public void canCollectEggs() {
            //Arrange
            Chicken ginger = new Chicken("ginger", 3);
            Chicken rooster = new Chicken("rooster", 1);
            Chicken steve = new Chicken("steve", 0);
            Chicken hal = new Chicken("hal", 6);
            farm.addChicken(ginger);
            farm.addChicken(rooster);
            farm.addChicken(steve);
            farm.addChicken(hal);
            // Act
            farmer.collectEggs(farm);
            // Assert
            int collectedEggs = farmer.getCollectedEggs();
            assertThat(collectedEggs).isEqualTo(10);


        }
    }


