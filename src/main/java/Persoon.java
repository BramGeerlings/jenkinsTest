/**
 * Created by GeerlingsB and RosanneJ on 11-12-2015.
 */
public class Persoon {
    private String Naam;
    private String Achternaam;

    public Persoon(String naam) {
        Naam = naam;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String naam) {
        Naam = naam;
    }

    public String getAchternaam() {
        return Achternaam;
    }

    public void setAchternaam(String achternaam) {
        Achternaam = achternaam;
    }
}