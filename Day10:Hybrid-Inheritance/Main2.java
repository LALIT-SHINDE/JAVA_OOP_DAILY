interface PersonActions {
    void displayPersonInfo();
}

interface EmployeeActions {
    void work();
}

interface ManagerActions {
    void manageTeam();
}

// Base Class
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPersonDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// Single Inheritance
class Employee extends Person implements PersonActions, EmployeeActions {
    protected int empId;
    protected double salary;

    public Employee(String name, int age, int empId, double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }

    @Override
    public void displayPersonInfo() {
        System.out.println("\n--- Employee Information ---");
        showPersonDetails();
        System.out.println("Employee ID : " + empId);
        System.out.println("Salary      : " + salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is working on assigned tasks.");
    }
}

// Hierarchical Inheritance
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int age, int empId,
                     double salary, String programmingLanguage) {
        super(name, age, empId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void writeCode() {
        System.out.println(name + " is coding in "
                + programmingLanguage + ".");
    }
}

class Tester extends Employee {
    private String testingTool;

    public Tester(String name, int age, int empId,
                  double salary, String testingTool) {
        super(name, age, empId, salary);
        this.testingTool = testingTool;
    }

    public void testApplication() {
        System.out.println(name + " is testing using "
                + testingTool + ".");
    }
}

// Multilevel Inheritance
class Manager extends Employee implements ManagerActions {
    protected int teamSize;

    public Manager(String name, int age, int empId,
                   double salary, int teamSize) {
        super(name, age, empId, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void manageTeam() {
        System.out.println(name + " is managing a team of "
                + teamSize + " members.");
    }
}

class ProjectManager extends Manager {
    private String projectName;

    public ProjectManager(String name, int age,
                          int empId, double salary,
                          int teamSize, String projectName) {
        super(name, age, empId, salary, teamSize);
        this.projectName = projectName;
    }

    public void monitorProject() {
        System.out.println(name +
                " is monitoring project: " + projectName);
    }
}

// Main Class
public class Main2 {
    public static void main(String[] args) {

        Developer dev = new Developer(
                "Siddharth", 21, 101,
                60000, "Java");

        Tester tester = new Tester(
                "Rahul", 22, 102,
                50000, "Selenium");

        ProjectManager pm = new ProjectManager(
                "Amit", 35, 103,
                120000, 10,
                "Banking System");

        System.out.println("===== DEVELOPER DETAILS =====");
        dev.displayPersonInfo();
        dev.work();
        dev.writeCode();

        System.out.println();

        System.out.println("===== TESTER DETAILS =====");
        tester.displayPersonInfo();
        tester.work();
        tester.testApplication();

        System.out.println();

        System.out.println("===== PROJECT MANAGER DETAILS =====");
        pm.displayPersonInfo();
        pm.work();
        pm.manageTeam();
        pm.monitorProject();
    }
}
