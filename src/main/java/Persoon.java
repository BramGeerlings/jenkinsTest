
public class Persoon {
    private String voornaam;
    private String achternaam;
    private String woonplaats;
    public String gedachte;

    public Persoon(){

    }

    @Override public String toString() {
        return "Hallo, ik ben "+this.getNaam()+" "+this.getAchternaam()+ ", "+", jij moet dit onthouden: "+this.gedachte;
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

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public String ditMoetJeOnthouden(String bericht){
        this.gedachte = bericht;
        return this.gedachte;
    }
}
