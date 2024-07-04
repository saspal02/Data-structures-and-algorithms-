package AbstractClasses;

public abstract class Parent {

    String school;

    public Parent(String school) {
        this.school = school;
    }

    public void displaySchool() {
        System.out.println("School: " + school);
    }
    abstract void career();
    abstract void partner();
}
