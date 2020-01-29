import pub.domain.Brewery;
import pub.infra.duvel.DuvelBrewery;

module infra.duvel {
    requires domain;
    provides Brewery with DuvelBrewery;
}