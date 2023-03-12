package locations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class LocationsController {

 /*
    private final List<Location> locations = Arrays.asList(
            new Location("Budapest", 47.497912, 19.040235),
            new Location("Tata", 47.65051715460511, 18.319404136954642),
            new Location("Szombathely", 47.253228294656786, 16.60881063262309)
    );

 */

    private LocationsService locationsService;

    public LocationsController(LocationsService locationsService) {
        this.locationsService = locationsService;
    }

    @GetMapping("/locations")
    public String getLocations() {
        return locationsService.getLocations().toString();
    }
}
