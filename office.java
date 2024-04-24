/* Create a class for employee with attributes name, age and address.
Create a class manager of worker, which will inherit the employee class.
The manager class has extra attributes – department and salary.
The worker class has attributes – no. of days worked, daily wages and total salary.
Add necessary no. of functions to calculate total salary of worker and display output of all classes.*/

// Employee class
class Employee {
    String name;
    int age;
    String address;

    Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

class Manager extends Employee {
    String department;
    double salary;

    Manager(String name, int age, String address, String department, double salary) {
        super(name, age, address);
        this.department = department;
        this.salary = salary;
    }

    // Display method
    public void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Worker class inheriting from Employee
class Worker extends Employee {
    int daysWorked;
    double dailyWages;
    double totalSalary;

    Worker(String name, int age, String address, int daysWorked, double dailyWages) {
        super(name, age, address);
        this.daysWorked = daysWorked;
        this.dailyWages = dailyWages;
        calculateTotalSalary();
    }

    private void calculateTotalSalary() {
        totalSalary = daysWorked * dailyWages;
    }

    public void display() {
        super.display();
        System.out.println("Days Worked: " + daysWorked);
        System.out.println("Daily Wages: $" + dailyWages);
        System.out.println("Total Salary: $" + totalSalary);
    }
}

public class office {
    public static void main(String[] args) {
        // Create an Employee
        Employee employee = new Employee("ROHIT 1", 22, "Birati");
        System.out.println("Employee Details:");
        employee.display();
        System.out.println();

        // Create a Manager
        Manager manager = new Manager("ROHIT 2", 28, "kolkata", "MCA", 5000);
        System.out.println("Manager Details:");
        manager.display();
        System.out.println();

        // Create a Worker
        Worker worker = new Worker("Rohit 3", 25, "West Bengal", 30, 200);
        System.out.println("Worker Details:");
        worker.display();
    }
}
