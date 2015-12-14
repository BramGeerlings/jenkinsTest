/**
 * Created by GeerlingsB and RosanneJ on 11-12-2015.
 */
public class Persoon {
    private String naam;
    private String achternaam;

    public Persoon(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }
}
