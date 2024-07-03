package Example;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        // Accessing members from an instance of Parent class
        System.out.println("From Parent Instance:");
        System.out.println(parent.publicVar);    // Accessible
        // System.out.println(parent.protectedVar); // Not accessible
        // System.out.println(parent.defaultVar);   // Not accessible
        // System.out.println(parent.privateVar);   // Not accessible

        parent.publicMethod();     // Accessible
        // parent.protectedMethod(); // Not accessible
        // parent.defaultMethod();   // Not accessible
        // parent.privateMethod();   // Not accessible

        System.out.println("\nFrom Child Instance:");
        child.demonstrateAccess();

        System.out.println("\nDemonstrate Access within Parent Class:");
        parent.demonstrateAccess();
    }
}
