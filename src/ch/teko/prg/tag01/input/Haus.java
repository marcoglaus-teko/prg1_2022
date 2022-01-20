package ch.teko.prg.tag01.input;

public class Haus {
    // Attribute
    public String adresse;
    public int hausnummer;

    // Klassentyp Mensch
    public Mensch besitzer;

    // Konstruktor
    public Haus(String adresse, int hausnummer, Mensch besitzer) {
        this.adresse = adresse;
        this.hausnummer = hausnummer;
        this.besitzer = besitzer;
    }

    // Methoden
    public String getAdresse() {
        return adresse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public Mensch getBesitzer() {
        return besitzer;
    }
}
