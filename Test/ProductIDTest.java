
import Data.ProductID;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductIDTest {
    private ProductID product;
    @BeforeEach
    void setStuff(){
        product=new ProductID("1234");
    }
    @Test
    void testGetProductID(){
        String code=product.getPersonalID();
        assertEquals("1234",code);

    }

    @org.junit.jupiter.api.Test
    void testEquals() {
    }

    @org.junit.jupiter.api.Test
    void testHashCode() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}