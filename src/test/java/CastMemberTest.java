import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CastMemberTest {

    CastMember castMember;

    @Before
    public void before(){
        castMember = new CastMember("Joe");
    }

    @Test
    public void hasName(){
        assertEquals("Joe", castMember.getName());
    }

}
