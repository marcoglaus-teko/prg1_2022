package ch.teko.prg.tag01.input;

public class Auto {
    // Attribute
    public String marke;
    public String farbe;
    public int ps;
    public int jahrgang;

    // Konstruktoren
    public Auto(String marke, String farbe, int ps, int jahrgang) {
        this.marke = marke;
        this.farbe = farbe;
        this.ps = ps;
        this.jahrgang = jahrgang;
    }

    // Methoden
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public int getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang) {
        this.jahrgang = jahrgang;
    }
}
