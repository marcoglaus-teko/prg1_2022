package ch.teko.prg.tag06.solution.aufgabe3;

public class Manager extends Person{
    private int managerID;

    public Manager(String name, String vorname, int alter, int gehalt, int ferien, int managerID) {
        super(name, vorname, alter, gehalt, ferien);
        this.managerID = managerID;
    }
}
