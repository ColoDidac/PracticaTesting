package Data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class DigitalSignatureTest {

    @Test
    void test1(){
        byte papaya[] = "SignaGuay".getBytes();
        DigitalSignature sign = new DigitalSignature(papaya);
        assertEquals("HealthCardID{" + "personal code='" + papaya + '\'' + '}', sign.toString());
        assertThrows(IllegalArgumentException.class,()->{
            DigitalSignature healthCardID = new DigitalSignature();
        });
    }

}