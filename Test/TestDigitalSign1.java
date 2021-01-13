import Data.DigitalSignature;

import org.junit.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDigitalSign1 {

    @Test
    void provaSenseArg(){
        String signatura = "miraQueFirma";
        byte baits[] = signatura.getBytes();
        DigitalSignature sign = new DigitalSignature(baits);
        assertEquals(5, sign.proba());
        //assertEquals("HealthCardID{" + "personal code='" + baits + '\'' + '}', sign.toString());
        //assertEquals(new IllegalArgumentException("falta un argument"), new DigitalSignature());
    }
}
