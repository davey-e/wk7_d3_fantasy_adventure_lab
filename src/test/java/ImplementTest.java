import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImplementTest {

    Implement implement;

    @Before
    public void before(){
        implement = new Implement("Sword", 20);
    }

    @Test
    public void hasType(){
        assertEquals("Sword", implement.getType());
    }

    @Test
    public void hasDamagePoints(){
        assertEquals(20, implement.getDamagePoints());
    }




}
