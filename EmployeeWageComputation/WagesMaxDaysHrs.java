package Day4.EmployeeWageComputation;

public class WagesMaxDaysHrs {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int wagePerHr = 20;
        int workingDays = 1;
        int workingHrs = 0;
        int totalWorkingHrs = 0;

        while ((workingDays <= 20) && (totalWorkingHrs <= 100)){
            int empCheck = (int)Math.floor(Math.random() * 10) % 3;
            if (empCheck == 0){
                workingHrs = 8;
            }
            else if(empCheck == 1){
                workingHrs = 4;    //assume
            }
            else {
                workingHrs = 0;
            }
            workingDays++;
            totalWorkingHrs = totalWorkingHrs + workingHrs;
        }
        System.out.println("Employee Salary is: " + totalWorkingHrs * wagePerHr);
    }
}
