package AccessControl;

public class Employee extends Person {
    private String employeeId;

    public Employee(String name, int age, String address, String phoneNumber, String employeeId) {
        super(name, age, address, phoneNumber);
        this.employeeId = employeeId;
    }

    public void displayEmployeeInfo() {
        // Accessing protected member of superclass
        System.out.println("Employee Age: " + age);

        // Accessing public member of superclass
        System.out.println("Employee Address: " + address);

        // Accessing package-private member of superclass
        System.out.println("Employee Phone Number: " + phoneNumber);

        // Accessing private member of superclass is not allowed
        // System.out.println("Employee Name: " + name); // This will cause a compilation error

        // Accessing private method of superclass is not allowed
        // displayPrivateInfo(); // This will cause a compilation error
    }
}
