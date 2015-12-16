/**
 * Created by JoostenRKJ on 15-12-2015.
 */
public class headClass {
// push voor .git in repository path Jenkins
// de schedule moest worden ingevuld volgens website (zie docs)
    public static void main (String[] args){
        String onthouden = "http://kwxbuild.rabobank.nl:8080/jenkins/adjuncts/fe99a441/org/kohsuke/stapler/jquery/jquery.full.js";
        Persoon Bram = new Persoon("Geerlings", "Bram");
        Bram.ditMoetJeOnthouden(onthouden);
        System.out.println(Bram.toString());
    }
}
