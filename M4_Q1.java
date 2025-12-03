// Module 4 - Q1
// Create a program where: 
// Employee class has attributes name and salary, and a method displayInfo(). 
// Manager class inherits from Employee and has an extra attribute department. 
// Print all details using an object of Manager. 

class EmployeeM4 {
    String name;
    double salary;

    public EmployeeM4(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends EmployeeM4 {
    String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

public class M4_Q1 {
    public static void main(String[] args) {
        Manager m = new Manager("Rahul", 75000, "IT");
        m.displayInfo();
    }
}
