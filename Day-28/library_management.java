import java.util.Scanner;
public class library_management {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] name = new String[100];
        int[] id = new int[100];
        int[] q = new int[100];
        String[] aname = new String[100];
        System.out.println("******WELCOME TO LIBRARY RECORDS******");
        System.out.println("This system currently only handles 100 books.(Upgrading soon...)");
        System.out.println("So, you can navigate the system, using numbers and perform given options:");
        System.out.println("1- Display book list.");
        System.out.println("2- Add a book.");
        System.out.println("3- Remove a book.");
        System.out.println("4- Update book information.");
        System.out.println("5- Search for a book.");
        System.out.println("6- Exit.");
        int ch = 1,count = 0;
        while(ch != 6){
            System.out.println("\n*********************************************");
            System.out.print("Enter your choice: ");
            ch = in.nextInt();
            in.nextLine();
            if(ch == 1){
                if(count == 0){
                    System.out.println("No books in records yet, please add book info first.");
                    continue;
                }
                System.out.println("Displaying book information...");
                System.out.printf("%-22s %-10s %-22s %-15s\n","NAME","ID No.","AUTHOR'S NAME","QUANTITY");
                for(int i = 0;i<count;i++)
                    System.out.printf("%-22s %-10d %-22s %-15d\n",name[i],id[i],aname[i],q[i]);
            }
            else if(ch == 2){
                if(count == 100){
                    System.out.println("System record full!!. Delete some records to add new book.");
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
                    System.out.println("Book with ID No. "+id[count]+" already exists in records.");
                    continue;
                }
                System.out.println("Let's add a book.");
                System.out.print("NAME: ");
                name[count] = in.nextLine();
                System.out.print("AUTHOR'S NAME: ");
                aname[count] = in.nextLine();
                System.out.print("QUANTITY: ");
                q[count] = in.nextInt();
                in.nextLine();
                count++;
                System.out.println("New book added. No. of books in record is: "+count);
            }
            else if (ch == 3){
                if(count == 0){
                    System.out.println("No books in record for deletion!!");
                    continue;
                }
                System.out.print("Enter ID No. of book, whose records you wish to delete: ");
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
                    System.out.println("Book with ID No. "+eid+" does not exist in records.");
                    continue;
                }
                System.out.println("Book found, verify details: ");
                System.out.printf("%-22s %-10s %-22s %-15s\n","NAME","ID No.","AUTHOR'S NAME","QUANTITY");
                System.out.printf("%-22s %-10d %-22s %-15d\n",name[pos],id[pos],aname[pos],q[pos]);
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
                    aname[i] = aname[i+1];
                    q[i] = q[i+1];
                }
                count--;
                System.out.println("Book record deleted. No. of books in record is: "+count);
            }
            else if(ch == 4){
                if(count == 0){
                    System.out.println("No books in record for updation!!");
                    continue;
                }
                System.out.print("Enter ID No. of book, whose records you wish to update: ");
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
                    System.out.println("Book with ID No. "+eid+" does not exist in records.");
                    continue;
                }
                System.out.println("Book found, verify details: ");
                System.out.printf("%-22s %-10s %-22s %-15s\n","NAME","ID No.","AUTHOR'S NAME","QUANTITY");
                System.out.printf("%-22s %-10d %-22s %-15d\n",name[pos],id[pos],aname[pos],q[pos]);
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
                id[pos] = in.nextInt();
                in.nextLine();
                System.out.print("AUTHOR'S NAME: ");
                aname[pos] = in.nextLine();
                System.out.print("QUANTITY: ");
                q[pos] = in.nextInt();
                in.nextLine();
                System.out.println("Updation complete.");
            }
            else if(ch == 5){
                if(count == 0){
                    System.out.println("No books in record for searching!!");
                    continue;
                }
                System.out.print("Enter ID No. of book, whom you wish to search: ");
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
                    System.out.println("Book with ID No. "+eid+" does not exist in records.");
                    continue;
                }
                System.out.println("Book found, details: ");
                System.out.printf("%-22s %-10s %-22s %-15s\n","NAME","ID No.","AUTHOR'S NAME","QUANTITY");
                System.out.printf("%-22s %-10d %-22s %-15d\n",name[pos],id[pos],aname[pos],q[pos]);
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
