package Day4.EmployeeWageComputation;

public class DailyEmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int wagePerHr = 20;
        int fullDayHr = 8;
        int wages = wagePerHr * fullDayHr;

        int empCheck = (int)Math.floor(Math.random() * 10) %2;

        if (empCheck == 0){
            System.out.println("Employee is Absent");
            System.out.println("Employee Salary is zero");
        }

        if (empCheck == 1){
            System.out.println("Empolyee is Present");
            System.out.println("Employee Salary is: " + wages);
        }
    }
}
