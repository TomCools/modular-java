package pub.console;

import pub.domain.Beer;
import pub.domain.Pub;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pub pub = new Pub();

        List<Beer> beerMenu = pub.getBeerMenu();

        System.out.println("The list of beers: " + beerMenu);
    }

}
