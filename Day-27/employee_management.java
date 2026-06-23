import java.util.Scanner;
public class employee_management {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] name = new String[100];
        int[] id = new int[100];
        double[] sal = new double[100];
        String[] des = new String[100];
        System.out.println("******WELCOME TO EMPLOYEE RECORDS******");
        System.out.println("This system currently only handles 100 employees.(Upgrading soon...)");
        System.out.println("So, you can navigate the system, using numbers and perform given options:");
        System.out.println("1- Display employee list.");
        System.out.println("2- Add a employee.");
        System.out.println("3- Remove a employee.");
        System.out.println("4- Update employee information.");
        System.out.println("5- Search for a employee.");
        System.out.println("6- Exit.");
        int ch = 1,count = 0;
        while(ch != 6){
            System.out.println("\n*********************************************");
            System.out.print("Enter your choice: ");
            ch = in.nextInt();
            in.nextLine();
            if(ch == 1){
                if(count == 0){
                    System.out.println("No employee in records yet, please add employee info first.");
                    continue;
                }
                System.out.println("Displaying employee information...");
                System.out.printf("%-22s %-10s %-15s %-15s\n","NAME","ID No.","DESIGNATION","SALARY(ANNUAL)");
                for(int i = 0;i<count;i++)
                    System.out.printf("%-22s %-10d %-15s %-15f\n",name[i],id[i],des[i],sal[i]);
            }
            else if(ch == 2){
                if(count == 100){
                    System.out.println("System record full!!. Delete some records to add new employee.");
                    continue;
                }
                System.out.print("ID No.: ");
                id[count] = in.nextInt();
                in.nextLine();
                int pos = -1;
                for(int i = 0;i<count;i++){
                    if(id[i] == id[count]){
                        pos = i;
                        break;
                    }
                }
                if(pos != -1){
                    System.out.println("Employee with ID No. "+id[count]+" already exists in records.");
                    continue;
                }
                System.out.println("Let's add a employee.");
                System.out.print("NAME: ");
                name[count] = in.nextLine();
                System.out.print("DESIGNATION: ");
                des[count] = in.nextLine();
                System.out.print("SALARY(ANNUAL): ");
                sal[count] = in.nextDouble();
                in.nextLine();
                count++;
                System.out.println("New employee added. No. of employees in record is: "+count);
            }
            else if (ch == 3){
                if(count == 0){
                    System.out.println("No employees in record for deletion!!");
                    continue;
                }
                System.out.print("Enter ID No. of employee, whose records you wish to delete: ");
                int eid = in.nextInt();
                in.nextLine();
                int pos = -1;
                for(int i = 0;i<count;i++){
                    if(id[i] == eid){
                        pos = i;
                        break;
                    }
                }
                if(pos == -1){
                    System.out.println("Employee with ID No. "+eid+" does not exist in records.");
                    continue;
                }
                System.out.println("Employee found, verify details: ");
                System.out.printf("%-22s %-10s %-15s %-15s\n","NAME","ID No.","DESIGNATION","SALARY(ANNUAL)");
                System.out.printf("%-22s %-10d %-15s %-15f\n",name[pos],id[pos],des[pos],sal[pos]);
                System.out.print("Enter 1 to proceed with deletion: ");
                int ech = in.nextInt();
                in.nextLine();
                if(ech != 1){
                    System.out.println("Canceling deletion.");
                    continue;
                }
                for(int i = pos;i<count-1;i++){
                    name[i] = name[i+1];
                    id[i] = id[i+1];
                    des[i] = des[i+1];
                    sal[i] = sal[i+1];
                }
                count--;
                System.out.println("Employee record deleted. No. of employees in record is: "+count);
            }
            else if(ch == 4){
                if(count == 0){
                    System.out.println("No employees in record for updation!!");
                    continue;
                }
                System.out.print("Enter ID No. of employee, whose records you wish to update: ");
                int eid = in.nextInt();
                in.nextLine();
                int pos = -1;
                for(int i = 0;i<count;i++){
                    if(id[i] == eid){
                        pos = i;
                        break;
                    }
                }
                if(pos == -1){
                    System.out.println("Employee with ID No. "+eid+" does not exist in records.");
                    continue;
                }
                System.out.println("Employee found, verify details: ");
                System.out.printf("%-22s %-10s %-15s %-15s\n","NAME","ID No.","DESIGNATION","SALARY(ANNUAL)");
                System.out.printf("%-22s %-10d %-15s %-15f\n",name[pos],id[pos],des[pos],sal[pos]);
                System.out.print("Enter 1 to proceed with updation: ");
                int ech = in.nextInt();
                in.nextLine();
                if(ech != 1){
                    System.out.println("Canceling updation.");
                    continue;
                }
                System.out.println("Enter new infromation:");
                System.out.print("NAME: ");
                name[pos] = in.nextLine();
                System.out.print("ID No.: ");
                id[count] = in.nextInt();
                in.nextLine();
                System.out.print("DESIGNATION: ");
                des[pos] = in.nextLine();
                System.out.print("SALARY(ANNUAL): ");
                sal[pos] = in.nextDouble();
                in.nextLine();
                System.out.println("Updation complete.");
            }
            else if(ch == 5){
                if(count == 0){
                    System.out.println("No employees in record for searching!!");
                    continue;
                }
                System.out.print("Enter ID No. of employee, whom you wish to search: ");
                int eid = in.nextInt();
                in.nextLine();
                int pos = -1;
                for(int i = 0;i<count;i++){
                    if(id[i] == eid){
                        pos = i;
                        break;
                    }
                }
                if(pos == -1){
                    System.out.println("Employee with ID No. "+eid+" does not exist in records.");
                    continue;
                }
                System.out.println("Employee found, details: ");
                System.out.printf("%-22s %-10s %-15s %-15s\n","NAME","ID No.","DESIGNATION","SALARY(ANNUAL)");
                System.out.printf("%-22s %-10d %-15s %-15f\n",name[pos],id[pos],des[pos],sal[pos]);
            }
        }
        System.out.println("EXITING.");
        System.out.println("Thank you for using this system.");
        in.close();
    }
}
