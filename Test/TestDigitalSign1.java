import Data.DigitalSignature;

import org.junit.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDigitalSign1 {

    @Test
    void provaSenseArg(){
        byte[] baits = {1, 0, 1, 0};
        DigitalSignature sign = new DigitalSignature(baits);
        assertEquals("HealthCardID{" + "personal code='" + baits + '\'' + '}', sign.toString());
        //assertEquals(new IllegalArgumentException("falta un argument"), new DigitalSignature());
    }
}
