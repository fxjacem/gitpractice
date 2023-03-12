package locations;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LocationsService {

    private final List<Location> locations = Arrays.asList(
            new Location("Budapest", 47.497912, 19.040235),
            new Location("Tata", 47.65051715460511, 18.319404136954642),
            new Location("Gyula", 46.64551837798603, 21.286642321763285),
            new Location("Szombathely", 47.253228294656786, 16.60881063262309)
    );

    public List<Location> getLocations() {
        return locations;
    }
}
