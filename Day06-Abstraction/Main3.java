abstract class Employee {

    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract void work();

    abstract void calculateBonus();

    void showDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);
        System.out.println("Salary        : " + salary);
    }

    void login() {
        System.out.println(name + " logged into system");
    }

    void logout() {
        System.out.println(name + " logged out from system");
    }
}

class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void work() {
        System.out.println(name + " is developing software");
    }

    void calculateBonus() {
        double bonus = salary * 0.20;
        System.out.println("Developer Bonus : " + bonus);
    }

    void writeCode() {
        System.out.println(name + " writes " + programmingLanguage + " code");
    }

    void debugCode() {
        System.out.println(name + " is debugging application");
    }

    void attendMeeting() {
        System.out.println(name + " attends technical meeting");
    }
}

class Manager extends Employee {

    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void work() {
        System.out.println(name + " manages development team");
    }

    void calculateBonus() {
        double bonus = salary * 0.30;
        System.out.println("Manager Bonus : " + bonus);
    }

    void conductMeeting() {
        System.out.println(name + " conducts project meeting");
    }

    void assignTask() {
        System.out.println(name + " assigns tasks to employees");
    }

    void checkPerformance() {
        System.out.println(name + " checks team performance");
    }
}

class Tester extends Employee {

    String testingTool;

    Tester(String name, int id, double salary, String testingTool) {
        super(name, id, salary);
        this.testingTool = testingTool;
    }

    void work() {
        System.out.println(name + " tests software modules");
    }

    void calculateBonus() {
        double bonus = salary * 0.15;
        System.out.println("Tester Bonus : " + bonus);
    }

    void executeTestCases() {
        System.out.println(name + " executes test cases");
    }

    void reportBug() {
        System.out.println(name + " reports bugs");
    }

    void automationTesting() {
        System.out.println(name + " performs automation testing using "
                + testingTool);
    }
}

public class AbstractionCompany {

    public static void main(String[] args) {

        Developer d1 = new Developer(
                "Rahul",
                101,
                70000,
                "Java"
        );

        d1.showDetails();
        d1.login();
        d1.work();
        d1.writeCode();
        d1.debugCode();
        d1.attendMeeting();
        d1.calculateBonus();
        d1.logout();

        System.out.println();

        Manager m1 = new Manager(
                "Sneha",
                201,
                95000,
                10
        );

        m1.showDetails();
        m1.login();
        m1.work();
        m1.conductMeeting();
        m1.assignTask();
        m1.checkPerformance();
        m1.calculateBonus();
        m1.logout();

        System.out.println();

        Tester t1 = new Tester(
                "Amit",
                301,
                50000,
                "Selenium"
        );

        t1.showDetails();
        t1.login();
        t1.work();
        t1.executeTestCases();
        t1.reportBug();
        t1.automationTesting();
        t1.calculateBonus();
        t1.logout();
    }
}
