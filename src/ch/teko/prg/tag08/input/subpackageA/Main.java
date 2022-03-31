package ch.teko.prg.tag08.input.subpackageA;

public class Main {
    public static void main(String[] args) {
        // befindet sich das Objekt von dem aus auf *protected* attribute zugegriffen wird im gleichen Package,
        // kann gleich wie bei *public* attribute direkt zugegriffen werden
        Person p1 = new Person("Meier", "HR", 35);
        System.out.printf("%s, %s, %d", p1.name, p1.position, p1.getAlter());

        Mitarbeiter m1 = new Mitarbeiter("Müller", "Lehrling", 17, 123);
        System.out.printf("%s, %s, %d, %d", m1.name, m1.position, m1.getAlter(), m1.getMitarbeiterID());
    }
}
