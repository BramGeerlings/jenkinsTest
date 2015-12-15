import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by JoostenRKJ on 14-12-2015.
 */
public class PersoonTest {
    @Test
    public void if_constructor_gets_the_right_name(){
        Persoon persoon = new Persoon("Joosten", "Rosanne");
        assertEquals("Rosanne", persoon.getNaam());
        assertEquals("Joosten", persoon.getAchternaam());
    }
    @Test
    public void if_set_methods_work_appropriately(){
        Persoon persoon = new Persoon();
        persoon.setAchternaam("Geerlings");
        persoon.setNaam("Bram");
        assertEquals("Bram", persoon.getNaam());
        assertEquals("Geerlings", persoon.getAchternaam());

    }

}
