import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CamperVanTest {

    CamperVan camperVan;

    @BeforeEach
    void setUp(){
        camperVan = new CamperVan("campervan", 5000,50, false);
    }

    @Test
    void canCheckClean(){
        assertThat(camperVan.checkClean()).isEqualTo(false);
    }
    @Test
    void canCleanUp(){
        camperVan.cleanUp();
        assertThat(camperVan.checkClean()).isEqualTo(true);
    }


}
