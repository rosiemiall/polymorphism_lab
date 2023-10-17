import models.Boat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BoatTest {

    Boat boat;

    @BeforeEach
    void setUp(){
        boat = new Boat("boat", 2000, 50,false );
    }

//    @Test
//    void canCheckFuel(){
//        assertThat(boat.checkFuel()).isEqualTo(50);
//    }
//
//    @Test
//    void canFillFuel(){
//        boat.fillFuel();
//        assertThat(boat.checkFuel()).isEqualTo(100);
//    }
//
//    @Test
//    void canGetPrice(){
//        assertThat(boat.getPrice()).isEqualTo(2000);
//    }
    @Test
    void canCheckHasAnchor(){
        assertThat(boat.checkAnchor()).isEqualTo(false);
    }
    @Test
    void canAddAnchor(){
        boat.addAnchor();
        assertThat(boat.checkAnchor()).isEqualTo(true);
    }
    @Test
    void canFloats(){
        assertThat(boat.floats(false)).isEqualTo("This boat can't float");
    }

}
