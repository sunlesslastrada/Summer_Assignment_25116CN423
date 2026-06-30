import java.util.Scanner;
public class mini_project {
    public void display(String[] name, int[] id, double[] per, String[] div,int count){
        System.out.println("Displaying student information...");
        System.out.printf("%-22s %-10s %-15s %-15s\n","NAME","ID No.","DIVISION","PERCENTAGE(ANNUAL)");
        for(int i = 0;i<count;i++)
            System.out.printf("%-22s %-10d %-15s %-15f\n",name[i],id[i],div[i],per[i]);
    }
    public int add(String[] name, int[] id, double[] per, String[] div,int count,Scanner in){
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
            System.out.println("Student with ID No. "+id[count]+" already exists in records.");
            return count;
        }
        System.out.println("Let's add a student.");
        System.out.print("NAME: ");
        name[count] = in.nextLine();
        System.out.print("DIVISION: ");
        div[count] = in.nextLine();
        System.out.print("PERCENTAGE(ANNUAL): ");
        per[count] = in.nextDouble();
        in.nextLine();
        count++;
        System.out.println("New student added. No. of students in record is: "+count);
        return count;
    }
    public int delete(String[] name, int[] id, double[] per, String[] div,int count,Scanner in){
        System.out.print("Enter ID No. of student, whose records you wish to delete: ");
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
            System.out.println("Student with ID No. "+eid+" does not exist in records.");
            return count;
        }
        System.out.println("Student found, verify details: ");
        System.out.printf("%-22s %-10s %-15s %-15s\n","NAME","ID No.","DIVISION","PERCENTAGE(ANNUAL)");
        System.out.printf("%-22s %-10d %-15s %-15f\n",name[pos],id[pos],div[pos],per[pos]);
        System.out.print("Enter 1 to proceed with deletion: ");
        int ech = in.nextInt();
        in.nextLine();
        if(ech != 1){
            System.out.println("Canceling deletion.");
            return count;
        }
        for(int i = pos;i<count-1;i++){
            name[i] = name[i+1];
            id[i] = id[i+1];
            div[i] = div[i+1];
            per[i] = per[i+1];
        }
        count--;
        System.out.println("Student record deleted. No. of students in record is: "+count);
        return count;
    }
    public void update(String[] name, int[] id, double[] per, String[] div,int count,Scanner in){
        System.out.print("Enter ID No. of student, whose records you wish to update: ");
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
            System.out.println("Student with ID No. "+eid+" does not exist in records.");
            return;
        }
        System.out.println("Student found, verify details: ");
        System.out.printf("%-22s %-10s %-15s %-15s\n","NAME","ID No.","DIVISION","PERCENTAGE(ANNUAL)");
        System.out.printf("%-22s %-10d %-15s %-15f\n",name[pos],id[pos],div[pos],per[pos]);
        System.out.print("Enter 1 to proceed with updation: ");
        int ech = in.nextInt();
        in.nextLine();
        if(ech != 1){
            System.out.println("Canceling updation.");
            return;
        }
        System.out.println("Enter new infromation:");
        System.out.print("NAME: ");
        name[pos] = in.nextLine();
        System.out.print("ID No.: ");
        id[pos] = in.nextInt();
        in.nextLine();
        System.out.print("DIVISION: ");
        div[pos] = in.nextLine();
        System.out.print("PERCENTAGE(ANNUAL): ");
        per[pos] = in.nextDouble();
        in.nextLine();
        System.out.println("Updation complete.");      
    }
    public void search(String[] name, int[] id, double[] per, String[] div,int count,Scanner in){
        System.out.print("Enter ID No. of student, whom you wish to search: ");
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
            System.out.println("Student with ID No. "+eid+" does not exist in records.");
            return;
        }
        System.out.println("Student found, details: ");
        System.out.printf("%-22s %-10s %-15s %-15s\n","NAME","ID No.","DIVISION","PERCENTAGE(ANNUAL)");
        System.out.printf("%-22s %-10d %-15s %-15f\n",name[pos],id[pos],div[pos],per[pos]);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        mini_project obj = new mini_project();
        String[] name = new String[100];
        int[] id = new int[100];
        double[] per = new double[100];
        String[] div = new String[100];
        System.out.println("******WELCOME TO STUDENT RECORDS******");
        System.out.println("This system currently only handles 100 students.(Upgrading soon...)");
        System.out.println("So, you can navigate the system, using numbers and perform given options:");
        System.out.println("1- Display student list.");
        System.out.println("2- Add a student.");
        System.out.println("3- Remove a student.");
        System.out.println("4- Update student information.");
        System.out.println("5- Search for a student.");
        System.out.println("6- Exit.");
        int ch = 1,count = 0;
        while(ch != 6){
            System.out.println("\n*********************************************");
            System.out.print("Enter your choice: ");
            ch = in.nextInt();
            in.nextLine();
            if(ch == 1){
                if(count == 0){
                    System.out.println("No students in records yet, please add student info first.");
                    continue;
                }
                obj.display(name,id,per,div,count);
            }
            else if(ch == 2){
                if(count == 100){
                    System.out.println("System record full!!. Delete some records to add new student.");
                    continue;
                }
                count = obj.add(name, id, per, div, count, in);
            }
            else if(ch == 3){
                if(count == 0){
                    System.out.println("No students in record for deletion!!");
                    continue;
                }
                count = obj.delete(name, id, per, div, count, in);
            }
            else if(ch == 4){
                if(count == 0){
                    System.out.println("No students in record for updation!!");
                    continue;
                }
                obj.update(name, id, per, div, count, in);
            }
            else if(ch == 5){
                if(count == 0){
                    System.out.println("No students in record for searching!!");
                    continue;
                }
                obj.search(name, id, per, div, count, in);
            }
            else if(ch!=6){
                System.out.println("Please enter valid choice.");
            }
        }
        System.out.println("EXITING.");
        System.out.println("Thank you for using this system.");
        in.close();
    }
}
