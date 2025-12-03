// Module 3 - Q1
// Create an Employee class with properties and methods:
// Property: salary (int)
// Method: getSalary() (returns int)
// Property: name (String)
// Method: getName() (returns String)
// Method: setName(String) (changes name)

class Employee {
    private int salary;
    private String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class M3_Q1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Shankar");
        e.setSalary(50000);

        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
}
