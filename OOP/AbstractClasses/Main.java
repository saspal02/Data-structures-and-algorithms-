package AbstractClasses;

import AbstractClasses.Daughter;

public class Main {
    public static void main(String[] args) {
        Son son = new Son("Dav");
        son.career();
        son.partner();

        Daughter daughter = new Daughter("Kv");
        daughter.displaySchool();
        son.displaySchool();

        daughter.career();
        daughter.partner();

        //Parent parent = new Parent() It can't instantiate since it abstract class.
    }
}
