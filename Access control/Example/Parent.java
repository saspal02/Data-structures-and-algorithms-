package Example;

public class Parent {
    // Public variable: accessible from anywhere
    public String publicVar = "Public Variable";

    // Protected variable: accessible within the package and subclasses
    protected String protectedVar = "Protected Variable";

    // Default (package-private) variable: accessible within the package
    String defaultVar = "Default Variable";

    // Private variable: accessible only within the class
    private String privateVar = "Private Variable";

    // Public method: accessible from anywhere
    public void publicMethod() {
        System.out.println("Public Method");
    }

    // Protected method: accessible within the package and subclasses
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    // Default (package-private) method: accessible within the package
    void defaultMethod() {
        System.out.println("Default Method");
    }

    // Private method: accessible only within the class
    private void privateMethod() {
        System.out.println("Private Method");
    }

    // Method to demonstrate access to all members within the class
    public void demonstrateAccess() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}
