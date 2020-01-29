package pub.infra.duvel;

import pub.domain.Beer;
import pub.domain.Brewery;

import java.util.List;

public class DuvelBrewery implements Brewery {
    public List<Beer> beerList() {
        return List.of(new Beer("Duvel", 3.5), new Beer("Duvel Trippel Hop", 2.0));
    }
}
