
import Data.ProductID;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductIDTest {
    private ProductID product;
    @BeforeEach
    void setStuff() throws Exception {
        product=new ProductID("1234");
    }
    @Test
    void testGetProductID(){
        String code=product.getPersonalID();
        assertEquals("1234",code);
    }
    @Test
    void emptyConstructor(){
        assertThrows(IllegalArgumentException.class, ()->{ ProductID emptyProduct= new ProductID(null);});
    }


    @Test
    void testEquals() throws Exception {
        String code= product.getPersonalID();
        ProductID equalProduct= new ProductID(code);
        assert(product.equals(equalProduct));
    }

    @Test
    void testHashCode() {
        ProductID sameProduct=product;
        assertEquals(sameProduct.hashCode(),product.hashCode());

    }

    
}