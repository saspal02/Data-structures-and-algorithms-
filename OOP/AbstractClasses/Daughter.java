package AbstractClasses;

public class Daughter extends Parent {

    @Override
    void career() {
        System.out.println("I want to be a nurse");

    }

    @Override
    void partner() {
        System.out.println("I love tea");

    }

    public Daughter(String school) {
        super(school);
    }



}
