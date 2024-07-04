package AbstractClasses;

public class Son extends Parent{

    @Override
    void career() {
        System.out.println("I am going to be a doctor");

    }

    @Override
    void partner() {
        System.out.println("I love Coffee");

    }

    public Son(String school) {
        super(school);

    }
}
