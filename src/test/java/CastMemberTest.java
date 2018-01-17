import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CastMemberTest {

    CastMember castMember;

    @Before
    public void before(){
        castMember = new CastMember("Joe", 20);
    }

    @Test
    public void hasName(){
        assertEquals("Joe", castMember.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(20, castMember.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints(){
        castMember.setHealthPoints(10);
        assertEquals(10, castMember.getHealthPoints());
    }

    @Test
    public void canSpeakName(){
        assertEquals("I am Joe", castMember.speakName());
    }

}
