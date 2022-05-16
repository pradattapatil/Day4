package Day4.EmployeeWageComputation;

public class EmployeePresAbs {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        //constants
        int IsFullTime = 1;
        //computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IsFullTime)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
