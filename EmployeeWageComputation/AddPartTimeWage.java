package Day4.EmployeeWageComputation;

public class AddPartTimeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int wagePerHr = 20;
        int fullDayHr =8;
        int partTimeHr = 8; //Assume part time 8 hr in uc3
        int wageFullDay =  wagePerHr * fullDayHr;
        int wageHalfDay = wagePerHr * partTimeHr;

        int empCheck = (int)Math.floor(Math.random() * 10) % 3;

        if (empCheck == 0){
            System.out.println("Employee is Absent");
            System.out.println("Employee Salary is zero");
        }

        if (empCheck == 1){
            System.out.println("Employee is Present");
            System.out.println("Employee Salary is: " + wageFullDay);
        }

        if (empCheck == 2){
            System.out.println("Employee is Present but only for half day");
            System.out.println("Employee Salary is: " + wageHalfDay);
        }
    }
}
