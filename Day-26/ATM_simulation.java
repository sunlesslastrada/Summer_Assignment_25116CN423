import java.util.Scanner;
public class ATM_simulation {
    public static void main(String[] args) throws InterruptedException{
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert card>>>>>>>>");
        System.out.print("Reading");
        for(int j = 0;j<3;j++){
            Thread.sleep(1000);
            System.out.print(".");
        }
        Thread.sleep(1500);
        System.out.println("\nYou can retrieve you card now.\n\nEnter your pin now for authentification:");
        Thread.sleep(1500);
        int pass=1,i,ch;
        String pw = "1234",epw;
        while(pass==1){
            i=3;
            while(i>0){
                System.out.print("PIN: ");
                epw = in.nextLine();
                if(epw.equals(pw)){
                    pass = 0;
                    break;
                }
                i--;
                System.out.println("\nWrong pin. "+i+" attempts remaning.");
            }
            if(i==0){
                System.out.print("\nYou have exhausted pin attempts. Enter 1 to reset pin, or any other number to exit- ");
                ch = in.nextInt();
                in.nextLine();
                while(ch==1){
                    System.out.println("\n****************************************\nEnter new pin:");
                    String str1 = in.nextLine();
                    System.out.println("Confirm pin:");
                    String str2 = in.nextLine();
                    if(str1.equals(str2)){
                        System.out.println("\nPin change successful. Re-enter pin for authentification.");
                        pw = str1;
                        break;
                    }
                    else{
                        System.out.println("\nPin must be same in both attempts. Enter 1 to retry or exit.");
                        ch = in.nextInt();
                        in.nextLine();
                    }
                }
                if(ch!=1){
                    System.out.println("EXITING.\nPLEASE VISIT AGAIN.");
                    System.exit(0);
                }
            }
        }
        Thread.sleep(2000);
        System.out.println("Authentication successful.");
        System.out.println("Enter a number to choose any option from below:");
        System.out.println("1 for Checking balance.");
        System.out.println("2 for Depositing money.");
        System.out.println("3 for Withdrawing money.");
        System.out.println("0 for exiting.");
        ch = 1;
        double bal=0,cash;
        while(ch!=0){
            System.out.print("Enter you choice:");
            ch = in.nextInt();
            in.nextLine();
            if(ch == 1){
                System.out.println("Accoung balance: "+bal);
            }
            else if(ch == 2){
                System.out.println("Enter amount to deposit and put the corresponding cash in collection tray:");
                cash = in.nextDouble();
                in.nextLine();
                System.out.print("Verifying");
                for(int j = 0;j<3;j++){
                    Thread.sleep(1000);
                    System.out.print(".");
                }
                if(cash==0){
                    System.out.println("Cannot deposit 0.");
                    continue;
                }
                if(cash<0){
                    System.out.println("Cannot deposit negative amount.");
                    continue;
                }
                bal+=cash;
                System.out.println("\nAmount verified. Sum of "+cash+" credited to account.");
            }
            else if(ch == 3){
                System.out.println("Enter amount to withdraw from account:");
                cash = in.nextDouble();
                in.nextLine();
                System.out.println("Verifying account balance.");
                Thread.sleep(2000);
                if(cash>bal){
                    System.out.println("Insufficient balance.");
                    continue;
                }
                System.out.print("Account balance verified. Dispensing");
                for(int j = 0;j<3;j++){
                    Thread.sleep(2000);
                    System.out.print(".");
                }
                bal-=cash;
                System.out.println("Finished dispensing collect sum of "+cash+" from dispenser.\nSum of "+cash+" has been debited from account.");
            }
            else if(ch!=0){
                System.out.println("Please enter valid choice.");
            }
        }
        System.out.println("EXITING.\nPLEASE VISIT AGAIN.");
        in.close();
    }
}
