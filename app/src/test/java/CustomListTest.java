import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null,new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton","AB"));
        assertEquals(list.getCount(),listSize + 1);
    }
    @Test
    void testHasCity() {
        City city = new City("Yellowknife", "Northwest Territories");
        list.add(city);
        assertTrue(list.hasCity(city));
    }
    @Test
    void testCountCities(){
        CityList cityList = mockCityList();
        City city1 = new City("Charlottetown", "Prince Edward Island");
        City city2 = new City("Yellowknife", "Northwest Territories");
        cityList.add(city1);
        cityList.add(city2);
        Assertions.assertEquals(3, cityList.getCities().size());


    }

}
