package ru.netology.geo;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoServiceImplTest {

    private GeoServiceImpl geoService = new GeoServiceImpl();

    @Test
    public void testByIp_RussianIp() {
        Location location = geoService.byIp("172.123.12.19");
        assertEquals("Moscow", location.getCity());
        assertEquals(Country.RUSSIA, location.getCountry());
    }

    @Test
    public void testByIp_AmericanIp() {
        Location location = geoService.byIp("96.44.183.149");
        assertEquals("New York", location.getCity());
        assertEquals(Country.USA, location.getCountry());
    }
}
