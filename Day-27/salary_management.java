import java.util.Scanner;
public class salary_management {
    public static void main(String[] args) throws InterruptedException{
        Scanner in = new Scanner(System.in);
        System.out.println("******WELCOME TO SALARY MANAGER******");
        System.out.println("This system, will take input about your salary details, and calculate relevant gross salary for you.");
        int ch = 1;
        while(ch == 1){
            System.out.println("************************************************");
            System.out.println("Enter the following details(monthly):");
            System.out.print("Basic salary: ");
            double bs = in.nextDouble();
            System.out.print("Dearness Allowance% (DA): ");
            double dap = in.nextDouble();
            System.out.print("House Rent Allowance (HRA): ");
            double hra = in.nextDouble();
            System.out.print("Any bonuses received: ");
            double bos = in.nextDouble();
            System.out.print("Provident fund: ");
            double pf = in.nextDouble();
            double gs = bs+hra+bos+(dap*bs/100);
            double ns = gs-pf;
            double tax,taxp;
            if(ns*12 <= 250000)
                taxp = 0;
            else if(ns*12 <= 500000)
                taxp = 0.05;
            else if(ns*12 <= 750000)
                taxp = 0.1;
            else if(ns*12 <= 1000000)
                taxp = 0.15;
            else if(ns*12 <= 1250000)
                taxp = 0.2;
            else if(ns*12 <= 1500000)
                taxp = 0.25;
            else
                taxp = 0.3;
            tax = ns*taxp;
            System.out.print("Calculating");
            for(int i = 0;i<3;i++){
                Thread.sleep(500);
                System.out.print(".");
            }
            System.out.println("\n\nYour salary details:");
            System.out.println("Gross Salary (Basic Salary + Allowances): "+gs);
            System.out.println("Net Salary (Gross Salary - Deductions): "+ns);
            System.out.println("According to your salary your income tax for the month comes out to: "+tax+" (Income Tax Rate: "+(taxp)+")");
            System.out.println("\nEnter 1 to calculate again, or any other number to quit.");
            ch = in.nextInt();
        }
        System.out.println("EXITING.");
        System.out.println("Thank you for using this system.");
        in.close();
    }
}
