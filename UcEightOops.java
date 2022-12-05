package day9;

public class UcEightOops {

    public static final int IS_PART_TIMEn= 1;
    public static final int IS_FULL_TIME = 2;

    public static int computeEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
        int empHrs = 0, totalEmpHrs = 0, totalWorkingdays = 0;
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingdays < numOfWorkingDays){
            totalWorkingdays++;
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_PART_TIMEn:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#:" +totalWorkingdays+"emp hr:" +empHrs);

        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage for company:"+company+"is:" +totalEmpWage);
        return totalEmpWage;
    }
    public static void main(String[] args) {
        computeEmpWage("DMart", 20, 2, 10);
        computeEmpWage("Reliance", 10, 4, 20);
    }
}