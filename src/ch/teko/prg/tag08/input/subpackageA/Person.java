package ch.teko.prg.tag08.input.subpackageA;

public class Person {
    public String name;
    protected String position;
    private int alter;

    public Person(String name, String position, int alter) {
        this.name = name;
        this.position = position;
        this.alter = alter;
    }

    public int getAlter() {
        return alter;
    }

    public String getPosition() {
        return position;
    }
}
