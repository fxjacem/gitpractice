package locations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LocationsControllerTest {

    @Mock
    LocationsService service;

    @InjectMocks
    LocationsController controller;

    @Test
    @DisplayName("Unit és integrációs tesztek")
    void getLocations() {
        List<Location> locations = Arrays.asList(
                new Location("Budapest", 47.497912, 19.040235),
                new Location("Tata", 47.65051715460511, 18.319404136954642));

        when(service.getLocations()).thenReturn(locations);

        assertThat(controller.getLocations()).contains("Tata", "Budapest");
        verify(service).getLocations();
    }
}