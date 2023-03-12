package locations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class LocationsControllerIT {

    @Autowired
    LocationsController controller;

    @Test
    @DisplayName("Unit és integrációs tesztek")
    void testGetLocations() {
        String locations = controller.getLocations();

        assertThat(locations).contains("Szombathely");
    }

}
