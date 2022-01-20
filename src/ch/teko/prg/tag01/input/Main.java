package ch.teko.prg.tag01.input;

public class Main {
    public static void main(String[] args) {
        Mensch m1 = new Mensch("Meier", "Hans", 45);
        System.out.println(m1.getVorname()+ ", " + m1.getName() + ", " + m1.getAlter());

        Auto auto1 = new Auto("BMW", "Rot", 200, 2015);
        System.out.println("Das Objekt auf welches die Variable auto1 vom Typ Auto referenziert ist: " + auto1.getMarke());

        Haus h1 = new Haus("Pilatusstrase", 38, m1);
        System.out.println("Der Besitzer des Hauses an der " + h1.getAdresse() + " " + h1.getHausnummer() + " ist: " + m1.getVorname() + " " + m1.getName());
    }
}
