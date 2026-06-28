import java.util.Scanner;
public class contact_management {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] name = new String[100];
        long[] pno = new long[100];
        System.out.println("******WELCOME TO CONTACT MANAGEMENT SYSTEM******");
        System.out.println("This system currently only handles 100 contacts.(Upgrading soon...)");
        System.out.println("You can navigate the system, using numbers and perform given options:");
        System.out.println("1- Display contact list.");
        System.out.println("2- Add a contact.");
        System.out.println("3- Remove a contact.");
        System.out.println("4- Update contact information.");
        System.out.println("5- Search for a contact.");
        System.out.println("6- Exit.");
        int ch = 1,count = 0;
        while(ch != 6){
            System.out.println("\n*********************************************");
            System.out.print("Enter your choice: ");
            ch = in.nextInt();
            in.nextLine();
            if(ch == 1){
                if(count == 0){
                    System.out.println("No contact in records yet, please add contact info first.");
                    continue;
                }
                System.out.println("Displaying contact information...");
                System.out.printf("%-22s %-20s\n","NAME","PHONE No.");
                for(int i = 0;i<count;i++)
                    System.out.printf("%-22s %-20d \n",name[i],pno[i]);
            }
            else if(ch == 2){
                if(count == 100){
                    System.out.println("System record full!!. Delete some records to add new contact.");
                    continue;
                }
                System.out.print("PHONE No.: ");
                pno[count] = in.nextLong();
                in.nextLine();
                if(Long.toString(pno[count]).length() != 10){
                    System.out.println("Invalid phone number.");
                    continue;
                }
                int pos = -1;
                for(int i = 0;i<count;i++){
                    if(pno[i] == pno[count]){
                        pos = i;
                        break;
                    }
                }
                if(pos != -1){
                    System.out.println("Contact with Phone No. "+pno[count]+" already exists in records.");
                    continue;
                }
                System.out.println("Let's add the contact.");
                System.out.print("NAME: ");
                name[count] = in.nextLine();
                count++;
                System.out.println("New contact added. No. of contacts in record is: "+count);
            }
            else if (ch == 3){
                if(count == 0){
                    System.out.println("No contacts in record for deletion!!");
                    continue;
                }
                System.out.print("Enter PHONE No. of contact, whose records you wish to delete: ");
                int epno = in.nextInt();
                in.nextLine();
                int pos = -1;
                for(int i = 0;i<count;i++){
                    if(pno[i] == epno){
                        pos = i;
                        break;
                    }
                }
                if(pos == -1){
                    System.out.println("Contact with Phone No. "+epno+" does not exist in records.");
                    continue;
                }
                System.out.println("Contact found, verify details: ");
                System.out.printf("%-22s %-20s\n","NAME","PHONE No.");
                    System.out.printf("%-22s %-20d \n",name[pos],pno[pos]);
                System.out.print("Enter 1 to proceed with deletion: ");
                int ech = in.nextInt();
                in.nextLine();
                if(ech != 1){
                    System.out.println("Canceling deletion.");
                    continue;
                }
                for(int i = pos;i<count-1;i++){
                    name[i] = name[i+1];
                    pno[i] = pno[i+1];
                }
                count--;
                System.out.println("Contact record deleted. No. of contacts in record is: "+count);
            }
            else if(ch == 4){
                if(count == 0){
                    System.out.println("No contacts in record for updation!!");
                    continue;
                }
                System.out.print("Enter PHONE No. of contact, whose records you wish to update: ");
                int epno = in.nextInt();
                in.nextLine();
                int pos = -1;
                for(int i = 0;i<count;i++){
                    if(pno[i] == epno){
                        pos = i;
                        break;
                    }
                }
                if(pos == -1){
                    System.out.println("Contact with PHONE No. "+epno+" does not exist in records.");
                    continue;
                }
                System.out.println("contact found, verify details: ");
                System.out.printf("%-22s %-20s\n","NAME","PHONE No.");
                System.out.printf("%-22s %-20d \n",name[pos],pno[pos]);
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
                System.out.print("PHONE No.: ");
                pno[count] = in.nextLong();
                in.nextLine();
                System.out.println("Updation complete.");
            }
            else if(ch == 5){
                if(count == 0){
                    System.out.println("No contacts in record for searching!!");
                    continue;
                }
                System.out.print("Enter PHONE No. of contact, whom you wish to search: ");
                int epno = in.nextInt();
                in.nextLine();
                int pos = -1;
                for(int i = 0;i<count;i++){
                    if(pno[i] == epno){
                        pos = i;
                        break;
                    }
                }
                if(pos == -1){
                    System.out.println("Contact with PHONE No. "+epno+" does not exist in records.");
                    continue;
                }
                System.out.println("contact found, details: ");
                System.out.printf("%-22s %-20s\n","NAME","PHONE No.");
                System.out.printf("%-22s %-20d \n",name[pos],pno[pos]);
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
