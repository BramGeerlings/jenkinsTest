import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by GeerlingsB on 11-12-2015.
 */

public class GetalTest{
    @Test
    public void test_if_getal_returns_10(){
        Getal getal = new Getal();
        assertEquals(1,getal.getGetal());
    }

}
