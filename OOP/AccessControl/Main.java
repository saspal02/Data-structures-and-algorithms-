package AccessControl;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 45, "123 Elm St", "555-1234");
        person.displayInfo();

        Employee employee = new Employee("Jane Doe", 30, "456 Oak St", "555-5678", "E123");
        employee.displayEmployeeInfo();

        // Accessing public member directly
        System.out.println("Public Address: " + employee.address);

        // Accessing protected member directly is not allowed outside the package
        // System.out.println("Protected Age: " + employee.age); // This will cause a compilation error

        // Accessing package-private member directly is not allowed outside the package
        // System.out.println("Package-private Phone: " + employee.phoneNumber); // This will cause a compilation error

        // Accessing private member directly is not allowed
        // System.out.println("Private Name: " + person.name); // This will cause a compilation error
    }
}
