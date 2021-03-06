public class EmpWageBuilderMultiCompany{
   public static final int isFullTime = 2;
   public static final int isPartTime = 1;
   public static int computeempwage(String Company, int EmpratePerHr, int numWorkingDays, int max_hrs_in_month)
   {
      int EmpHrs = 0, total_emp_hrs = 0, total_working_days = 0;
      while(total_working_days < max_hrs_in_month && total_working_days < numWorkingDays)
      {
         double Empcheck=Math.floor(Math.random()*10)%3;
         switch((int)Empcheck){
            case 1:
               EmpHrs=8;
               break;
            case 2:
               EmpHrs=8;
               break;
            default:
               EmpHrs=0;
               break;
         }
         total_emp_hrs += EmpHrs;
         System.out.println("Day : " + total_working_days + " Emp Hr: " + EmpHrs);
         total_working_days++;
      }
      int totalEmpWage = total_emp_hrs * EmpratePerHr;
      System.out.println("Total Emp Wage :  " + totalEmpWage);
      return totalEmpWage;
   }
   public static void main(String args[])
   {
      computeempwage("Flipkart", 20, 2, 10);
      computeempwage("Amazon", 10, 4, 20);
   }
}
