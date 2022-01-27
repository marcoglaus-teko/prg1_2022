package ch.teko.prg.tag01.solution;

public class Main {
    public static void main(String[] args) {
        // Erstellen von 3 Objekten der Klasse Pkw mithilfe des Schlüsselworts "new"
        Pkw pkw1 = new Pkw("Wartburg", "353", 50);
        Pkw pkw2 = new Pkw("VW", "Lupo", 50);
        Pkw pkw3 = new Pkw("Chevrolet", "Bel Air", 250);

        // Konsolenausgabe
        System.out.println("In meiner Garage stehen folgende 3 Autos:");
        System.out.println("Marke " + pkw1.getMarke() + ", Modell " + pkw1.getModell() + ", " + pkw1.getPs() + " PS");
        System.out.printf("Marke %s, Modell %s, %d PS%n", pkw2.getMarke(), pkw2.getModell(), pkw2.getPs());
        System.out.printf("Marke %s, Modell %s, %d PS", pkw3.getMarke(), pkw3.getModell(), pkw3.getPs());

    }
}
