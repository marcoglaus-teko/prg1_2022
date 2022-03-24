package ch.teko.prg.prüfung.aufgabe7;

public class Parkplatz {
    private Auto[] parkfelder;
    private String parkplatzName;

    public Parkplatz(int anzahlFelder, String parkplatzName) {
        this.parkfelder = new Auto[anzahlFelder];
        this.parkplatzName = parkplatzName;
    }

    public void parkiereAuto(int parkplatzNummer, Auto auto) {
        this.parkfelder[parkplatzNummer] = auto;
    }

    public Auto[] getParkfelder() {
        return parkfelder;
    }

    public String getParkplatzName() {
        return parkplatzName;
    }
}
