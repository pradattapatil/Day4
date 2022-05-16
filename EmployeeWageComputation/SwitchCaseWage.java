package Day4.EmployeeWageComputation;

public class SwitchCaseWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int wagePerHr = 20;
        int fullDayHr = 8;
        int partTimeHr = 8;   //assume part time 8 hr in uc
        int wageFullDay = wagePerHr * fullDayHr;
        int wageHalfDay = wagePerHr * partTimeHr;

        int empCheck = (int)Math.floor(Math.random() * 10) % 3;

        switch (empCheck){
            case 0:
                System.out.println("Employee is Absent");
                System.out.println("Employee Salary is zero");
                break;

            case 1:
                System.out.println("Employee is Present");
                System.out.println("Employee Salary is: " + wageFullDay);
                break;

            case 2:
                System.out.println("Employee is Present but only for half day");
                System.out.println("Employee Salary is: " + wageHalfDay);
                break;
        }
    }
}
