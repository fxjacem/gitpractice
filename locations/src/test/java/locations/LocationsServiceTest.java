package locations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LocationsServiceTest {

    @Test
    @DisplayName("Unit és integrációs tesztek")
    void testGetLocations() {
        LocationsService service = new LocationsService();
        List<String> cities = service.getLocations()
                .stream()
                .map(Location::getName)
                .toList();

        assertThat(cities)
                .hasSize(4)
                .contains("Tata", "Budapest");
    }
}