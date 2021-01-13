import Data.HealthCardID;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthCardIDTest {
    @Test
    void  HealthCardID(){
        String codeNull = null;
        assertThrows(IllegalArgumentException.class,()->{
            HealthCardID healthCardID = new HealthCardID(codeNull);
        });
    }

}