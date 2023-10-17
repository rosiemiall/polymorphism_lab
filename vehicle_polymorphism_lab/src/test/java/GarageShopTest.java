import models.Boat;
import models.CamperVan;
import models.Car;
import models.GarageShop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GarageShopTest {

    GarageShop garageShop;
    Car car;
    Boat boat;
    CamperVan camperVan;
    ArrayList stock;

    @BeforeEach
    void setUp(){
        garageShop = new GarageShop();
        car = new Car("car", 1000, 50, "VW", false );
        boat = new Boat("boat", 2000, 50,false );
        camperVan = new CamperVan("campervan", 5000,50, false);
    }

    @Test
    void canAddToStock(){
        stock = new ArrayList<>();
        stock.add(car);
        stock.add(boat);
        garageShop.addToStock(car);
        garageShop.addToStock(boat);
        assertThat(garageShop.getStock()).isEqualTo(stock);
    }

    @Test
    void canSellItemCheckPrice(){
//        stock = new ArrayList<>();
//        stock.add(car);
        garageShop.addToStock(car);
        garageShop.sellItem(car);
        assertThat(garageShop.getTill()).isEqualTo(1000);
    }
    @Test
    void canSellItemCheckStock(){
        stock = new ArrayList<>();
//        stock.add(car);
        garageShop.addToStock(boat);
        garageShop.sellItem(boat);
        assertThat(garageShop.getStock()).isEqualTo(stock);
    }
}
