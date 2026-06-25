import java.util.Scanner;
public class inventory_management {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] name = new String[100];
        int[] q = new int[100];
        double[] ppu = new double[100];
        String[] id = new String[100];
        System.out.println("******WELCOME TO INVENTORY MANAGEMENT SYSTEM******");
        System.out.println("This inventory currently only handles 100 items.(Upgrading soon...)");
        System.out.println("You can navigate the system, using numbers and perform given options:");
        System.out.println("1- Display inventory.");
        System.out.println("2- Add an item.");
        System.out.println("3- Remove an item.");
        System.out.println("4- Update item information.");
        System.out.println("5- Search for an item.");
        System.out.println("6- Exit.");
        int ch = 1,count = 0;
        while(ch != 6){
            System.out.println("\n*********************************************");
            System.out.print("Enter your choice: ");
            ch = in.nextInt();
            in.nextLine();
            if(ch == 1){
                if(count == 0){
                    System.out.println("No item in inventory yet, please add item info first.");
                    continue;
                }
                System.out.println("Displaying inventory...");
                System.out.printf("%-22s %-10s %-15s %-15s\n","ITEM NAME","ITEM ID","QUANTITY","PRICE PER UNIT");
                for(int i = 0;i<count;i++)
                    System.out.printf("%-22s %-10s %-15d %-15f\n",name[i],id[i],q[i],ppu[i]);
            }
            else if(ch == 2){
                if(count == 100){
                    System.out.println("System record full!!. Delete some records to add new item.");
                    continue;
                }
                System.out.print("ITEM ID.: ");
                id[count] = in.nextLine();
                int pos = -1;
                for(int i = 0;i<count;i++){
                    if(id[i].equals(id[count])){
                        pos = i;
                        break;
                    }
                }
                if(pos != -1){
                    System.out.println("ITEM with ID No. "+id[count]+" already exists in records.");
                    continue;
                }
                System.out.println("Let's add an item.");
                System.out.print("NAME: ");
                name[count] = in.nextLine();
                System.out.print("QUNATITY: ");
                q[count] = in.nextInt();
                System.out.print("PRICE PER UNIT: ");
                ppu[count] = in.nextDouble();
                in.nextLine();
                count++;
                System.out.println("New item added. No. of items in inventory is: "+count);
            }
            else if (ch == 3){
                if(count == 0){
                    System.out.println("No items in inventory for deletion!!");
                    continue;
                }
                System.out.print("Enter ID No. of item, whose records you wish to delete: ");
                String eid = in.nextLine();
                int pos = -1;
                for(int i = 0;i<count;i++){
                    if(id[i].equals(eid)){
                        pos = i;
                        break;
                    }
                }
                if(pos == -1){
                    System.out.println("Item with ID No. "+eid+" does not exist in inventory.");
                    continue;
                }
                System.out.println("Item found, verify details: ");
                System.out.printf("%-22s %-10s %-15s %-15s\n","ITEM NAME","ITEM ID","QUANTITY","PRICE PER UNIT");
                System.out.printf("%-22s %-10s %-15d %-15f\n",name[pos],id[pos],q[pos],ppu[pos]);
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
                    q[i] = q[i+1];
                    ppu[i] = ppu[i+1];
                }
                count--;
                System.out.println("Item record deleted. No. of items in inventory is: "+count);
            }
            else if(ch == 4){
                if(count == 0){
                    System.out.println("No items in record for updation!!");
                    continue;
                }
                System.out.print("Enter ID No. of item, whose records you wish to update: ");
                String eid = in.nextLine();
                int pos = -1;
                for(int i = 0;i<count;i++){
                    if(id[i].equals(eid)){
                        pos = i;
                        break;
                    }
                }
                if(pos == -1){
                    System.out.println("Item with ID No. "+eid+" does not exist in inventory.");
                    continue;
                }
                System.out.println("Employee found, verify details: ");
                System.out.printf("%-22s %-10s %-15s %-15s\n","ITEM NAME","ITEM ID","QUANTITY","PRICE PER UNIT");
                System.out.printf("%-22s %-10s %-15d %-15f\n",name[pos],id[pos],q[pos],ppu[pos]);
                System.out.print("Enter 1 to proceed with updation: ");
                int ech = in.nextInt();
                in.nextLine();
                if(ech != 1){
                    System.out.println("Canceling updation.");
                    continue;
                }
                System.out.println("Enter new infromation:");
                System.out.print("ITEM NAME: ");
                name[pos] = in.nextLine();
                System.out.print("ITEM ID .: ");
                id[pos] = in.nextLine();
                System.out.print("QUANTITY: ");
                q[pos] = in.nextInt();
                System.out.print("PRICE PER UNIT: ");
                ppu[pos] = in.nextDouble();
                in.nextLine();
                System.out.println("Updation complete.");
            }
            else if(ch == 5){
                if(count == 0){
                    System.out.println("No item in inventory for searching!!");
                    continue;
                }
                System.out.print("Enter ID No. of item, whom you wish to search: ");
                String eid = in.nextLine();
                int pos = -1;
                for(int i = 0;i<count;i++){
                    if(id[i].equals(eid)){
                        pos = i;
                        break;
                    }
                }
                if(pos == -1){
                    System.out.println("Item with ID No. "+eid+" does not exist in records.");
                    continue;
                }
                System.out.println("Item found, details: ");
                System.out.printf("%-22s %-10s %-15s %-15s\n","ITEM NAME","ITEM ID","QUANTITY","PRICE PER UNIT");
                System.out.printf("%-22s %-10s %-15d %-15f\n",name[pos],id[pos],q[pos],ppu[pos]);
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
