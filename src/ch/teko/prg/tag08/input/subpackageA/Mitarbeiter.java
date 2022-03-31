package ch.teko.prg.tag08.input.subpackageA;

public class Mitarbeiter extends Person{
    private int mitarbeiterID;

    public Mitarbeiter(String name, String position, int alter, int mitarbeiterID) {
        super(name, position, alter);
        this.mitarbeiterID = mitarbeiterID;
    }

    public int getMitarbeiterID() {
        return mitarbeiterID;
    }
}
