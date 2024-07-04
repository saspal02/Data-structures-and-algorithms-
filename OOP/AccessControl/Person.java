package AccessControl;

class Person {
    // private variable - accessible only within the class
    private String name;

    // protected variable - accessible within the class, package, and subclasses
    protected int age;

    // public variable - accessible from anywhere
    public String address;

    // package-private variable (default) - accessible within the package
    String phoneNumber;

    // Constructor
    public Person(String name, int age, String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // public method - accessible from anywhere
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }

    // private method - accessible only within the class
    private void displayPrivateInfo() {
        System.out.println("This is private info.");
    }
}
