import java.util.Random;
import java.util.Scanner;
public class ticket_booking {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        System.out.println("******WELCOME TO TICKET BOOKING SYSTEM******");
        System.out.println("This system currently only handles ticket booking for only one coach for now.(Upgrading soon...)");
        System.out.println("You can navigate the system, using numbers and perform given options:");
        System.out.println("1- Book ticket.");
        System.out.println("2- Cancel ticket.");
        System.out.println("3- View booking.");
        System.out.println("4- Check seat availability.");
        System.out.println("5- View all bookings.");
        System.out.println("6- Exit.");
        int seats[] = new int[80];
        String cn[] = new String[80];
        double bill;
        int t,ts = 80;
        int ch = 1;
        while(ch != 6){
            System.out.println("\n*********************************************");
            System.out.print("Enter your choice: ");
            ch = in.nextInt();
            in.nextLine();
            if(ch == 1){
                if(ts == 0){
                    System.out.println("Coach full. No seats available.");
                    continue;
                }
                System.out.print("Enter no. of tickets: ");
                t = in.nextInt();
                in.nextLine();
                int s;
                ts-=t;
                for(int i = 0;i < t;){
                    s= r.nextInt(80);
                    while(seats[s]!=1){
                        seats[s]++;
                        i++;
                        System.out.print("Enter traveller's name:");
                        cn[s] = in.nextLine();
                        System.out.println("Seat assigned: "+(s+1));
                    }
                }
                System.out.println("Tickets booked. No. of seats left for reservation is: "+ts);
            }
            else if(ch == 2){
                if(ts == 80){
                    System.out.println("Coach empty no tickets to cancel.");
                    continue;
                }
                System.out.print("Enter Seat no. of traveller, whose ticket you wish to delete: ");
                int esno = in.nextInt();
                in.nextLine();
                if(seats[esno-1] == 0){
                    System.out.println("Ticket with Seat No. "+esno+" is not booked.");
                    continue;
                }
                System.out.println("Ticket found, verify details: ");
                System.out.printf("%-22s %-20s\n","NAME","SEAT No.");
                System.out.printf("%-22s %-20d \n",cn[esno-1],esno);
                System.out.print("Enter 1 to proceed with deletion: ");
                int ech = in.nextInt();
                in.nextLine();
                if(ech != 1){
                    System.out.println("Canceling deletion.");
                    continue;
                }
                seats[esno-1] = 0;
                ts++;
                System.out.println("Ticket canceled. No. of seats left for reservation is: "+ts);
            }
            else if(ch == 3){
                if(ts == 80){
                    System.out.println("Coach empty.");
                    continue;
                }
                System.out.print("Enter Seat no. of traveller, whose ticket you wish to view: ");
                int esno = in.nextInt();
                in.nextLine();
                if(seats[esno-1] == 0){
                    System.out.println("Ticket with Seat No. "+esno+" is not booked.");
                    continue;
                }
                System.out.println("Ticket found, verify details: ");
                System.out.printf("%-22s %-20s\n","NAME","SEAT No.");
                System.out.printf("%-22s %-20d \n",cn[esno-1],esno);
                System.out.print("Enter 1 to proceed with updation: ");
                int ech = in.nextInt();
                in.nextLine();
                if(ech != 1){
                    System.out.println("Canceling updation.");
                    continue;
                }
                System.out.print("Enter new name: ");
                cn[esno-1] = in.nextLine();
            }
            else if(ch == 4){
                System.out.println("Total seats: 80");
                System.out.println("Booked seats: "+(80-ts));
                System.out.println("Available seats: "+ts);
            }
            else if(ch == 5){
                if(ts == 80){
                    System.out.println("No reservations made yet, please book tickets first.");
                    continue;
                }
                System.out.println("Displaying reservation information...");
                System.out.printf("%-22s %-20s\n","NAME","SEAT No.");
                for(int i = 0;i<80;i++){
                    if(seats[i] != 0)
                    System.out.printf("%-22s %-20d \n",cn[i],(i+1));
                }
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
