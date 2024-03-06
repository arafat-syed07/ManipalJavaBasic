package inheritance;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(700);
        HRManager mgr = new HRManager(300);

        emp.work();
        System.out.println("Employee salary: " + emp.getSalary());

        mgr.work();
        System.out.println("Manager salary: " + mgr.getSalary());
        mgr.addEmployee();
    }
}
