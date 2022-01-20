package ch.teko.prg.tag01.input;

public class Main {
    public static void main(String[] args) {
        Mensch m1 = new Mensch("Meier", "Hans", 45);
        System.out.println(m1.getVorname()+ ", " + m1.getName() + ", " + m1.getAlter());
    }
}
