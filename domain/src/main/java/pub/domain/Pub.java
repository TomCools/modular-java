package pub.domain;

import java.util.List;
import java.util.ServiceLoader;

public class Pub {
    Brewery brewery;

    public Pub(Brewery brewery) {
        this.brewery = brewery;
    }

    public Pub() {
        ServiceLoader<Brewery> sl = ServiceLoader.load(Brewery.class);
        this.brewery = sl.findFirst().orElseThrow(() -> new RuntimeException("No implementation of Brewery found."));
    }

    public List<Beer> getBeerMenu() {
        return brewery.beerList();
    }
}
