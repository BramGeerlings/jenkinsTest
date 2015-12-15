/**
 * Created by GeerlingsB and RosanneJ on 11-12-2015.
 */
public class Persoon {
    private String voornaam;
    private String achternaam;

    public Persoon(){

    }

    public Persoon(String naam) {
        this.voornaam = naam;
    }

    public Persoon(String achternaam, String naam) {
        this.achternaam = achternaam;
        this.voornaam = naam;
    }

    public String getNaam() {
        return voornaam;
    }

    public void setNaam(String naam) {
        this.voornaam = naam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }
}
