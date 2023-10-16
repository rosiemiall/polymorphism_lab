import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    void setUp(){
        car = new Car("car", 1000, 50, "VW", false );
    }

//    @Test
//    void canCheckFuel(){
//        assertThat(car.checkFuel()).isEqualTo(50);
//    }
//
//    @Test
//    void canFillFuel(){
//        car.fillFuel();
//        assertThat(car.checkFuel()).isEqualTo(100);
//    }
//
//    @Test
//    void canGetPrice(){
//        assertThat(car.getPrice()).isEqualTo(1000);
//    }
    @Test
    void canGetBrand(){
        assertThat(car.getName()).isEqualTo("car");
    }

    @Test
    void canChangeTires(){
        car.changeTires();
        assertThat(car.checkWinterTires()).isEqualTo(true);
    }
}
