package pub.domain.helpers;

import pub.domain.Beer;

import java.util.List;

public class StaticBeerHelper {
    public static List<Beer> getDummyBeers() {
        return List.of(new Beer("Duvel", 3.5), new Beer("Heineken", 2.0));
    }
}
