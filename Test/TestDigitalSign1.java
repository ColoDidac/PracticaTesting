import Data.DigitalSignature;

import org.junit.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDigitalSign1 {

    @Test
    void provaSenseArg(){
        DigitalSignature sign = new DigitalSignature();
        assertEquals(new IllegalArgumentException("falta un argument"), new DigitalSignature());
    }
}
