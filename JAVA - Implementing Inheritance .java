class Person {
    String name;
    long contact;
    Person(String name, long contact) {
        this.name = name;
        this.contact = contact;
    }}

class Employee extends Person {
    int empID;
    String designation;
    Employee(String name, long contact, int empID, String designation) {
        super(name, contact);
        this.empID = empID;
        this.designation = designation;
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Contact: " + contact);
        System.out.println("ID: " + empID);
        System.out.println("Designation: " + designation);
        System.out.println("---------------------------");
    }
}

class Customer extends Person {
    int customerID;
    int invoiceNo;

    Customer(String name, long contact, int customerID, int invoiceNo) {
        super(name, contact);
        this.customerID = customerID;
        this.invoiceNo = invoiceNo;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Contact: " + contact);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Invoice No: " + invoiceNo);
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 9876543210L, 101, "Software Engineer");
        Customer cust = new Customer("Jane Smith", 9123456789L, 505, 10024);

        emp.displayEmployee();
        cust.displayCustomer();
    }
}
