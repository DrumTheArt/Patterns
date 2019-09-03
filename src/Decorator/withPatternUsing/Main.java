package Decorator.withPatternUsing;

public class Main {

    public static void main(String[] args) {

        Gericht gericht = new Salat(new Hueftsteak());

        gericht.printDescription();
    }
}
