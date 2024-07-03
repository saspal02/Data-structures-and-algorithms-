package Example;

public class Child extends Parent {
    public void demonstrateAccess() {
        // Can access public and protected members from the Parent class
        System.out.println(publicVar);     // Accessible
        System.out.println(protectedVar);  // Accessible

        // Cannot access default and private members from the Parent class
        // System.out.println(defaultVar); // Not accessible
        // System.out.println(privateVar); // Not accessible

        publicMethod();      // Accessible
        protectedMethod();   // Accessible

        // Cannot access default and private methods from the Parent class
        // defaultMethod();   // Not accessible
        // privateMethod();   // Not accessible
    }
}
