package ch.teko.prg.prüfung.aufgabe7;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Kreis", 10, 15, 5.0);
        System.out.println("Fläche beträgt: " + circle.calcArea());
    }
}
