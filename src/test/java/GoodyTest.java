import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodyTest {

    Goody goody;


    @Before
    public void before(){
        goody = new Goody("Bob", 50);
    }

//    @Test
//    public void hasImplement(){
//        assertEquals(weapon, goody.getImplement());
//    }
}
