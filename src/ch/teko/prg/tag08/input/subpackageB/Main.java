package ch.teko.prg.tag08.input.subpackageB;

import ch.teko.prg.tag08.input.subpackageA.Mitarbeiter;
import ch.teko.prg.tag08.input.subpackageA.Person;

public class Main {
    public static void main(String[] args) {
        // befindet sich das Objekt von dem aus auf *protected* attribute zugegriffen wird NICHT im gleichen Package,
        // kann nicht direkt zugegriffen werden --> public oder getter-Methoden zur Verfügung stellen
        Person p1 = new Person("Meier", "HR", 35);
        System.out.printf("%s, %s, %d", p1.name, p1.getPosition(), p1.getAlter());

        Mitarbeiter m1 = new Mitarbeiter("Müller", "Lehrling", 17, 123);
        System.out.printf("%s, %s, %d, %d", m1.name, m1.getPosition(), m1.getAlter(), m1.getMitarbeiterID());
    }
}
