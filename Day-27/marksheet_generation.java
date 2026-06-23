import java.util.Scanner;
public class marksheet_generation {
    public static void main(String[] args) throws InterruptedException{
        Scanner in = new Scanner(System.in);
        System.out.println("******WELCOME TO MARKSHEET GENERATOR******");
        System.out.println("This system will generate marksheet, after receiving relevant information.");
        int ch = 1;
        while(ch == 1){
            String name, div;
            double phy,chem,bio,math,eng,cs,max,per;
            int id;
            System.out.println("\nEnter details as prompted:");
            System.out.print("Name: ");
            name = in.nextLine();
            System.out.print("ID No.: ");
            id = in.nextInt();
            in.nextLine();
            System.out.print("Division: ");
            div = in.nextLine();
            System.out.println("\nEnter marks of-");
            System.out.print("Mathematics: ");
            math = in.nextDouble();
            System.out.print("Physics: ");
            phy = in.nextDouble();
            System.out.print("Chemistry: ");
            chem = in.nextDouble();
            System.out.print("Biology: ");
            bio = in.nextDouble();
            System.out.print("English: ");
            eng = in.nextDouble();
            System.out.print("Computer Science: ");
            cs = in.nextDouble();
            System.out.print("Maximum marks obtainable: ");
            max = in.nextDouble();
            per = (math+phy+chem+bio+eng+cs)*100/max/6;
            char gr;
            if(per >= 90) gr = 'A';
            else if(per >= 80) gr = 'B';
            else if(per >= 60) gr = 'C';
            else if(per >= 50) gr = 'D';
            else if(per > 33) gr = 'E';
            else gr = 'F';
            System.out.print("Generating");
            for(int i = 0;i<3;i++){
                Thread.sleep(500);
                System.out.print(".");
            }
            System.out.println("\n Generation complete.");
            System.out.println("\n**************************************************************************************");
            System.out.printf("%50s\n", "MARKSHEET");
            System.out.printf("%-15s %-10s\n","NAME: ",name);
            System.out.printf("%-15s %-10s\n","DIVISION: ",div);
            System.out.printf("%-15s %-10d\n\n","ID No.: ",id);
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", "Mathematics", "Physics", "Chemistry", "Biology", "English", "Computer Science");
            System.out.printf("%5f %15f %15f %15f %15f %15f\n", math, phy, chem, bio, eng, cs);
            System.out.println("\nPERCENTAGE: "+per);
            System.out.println("GRADE: "+gr);
            System.out.println("**************************************************************************************");
            System.out.println("\n\nEnter 1 to calculate again, or any other number to quit.");
            ch = in.nextInt();
        }
        System.out.println("EXITING.");
        System.out.println("Thank you for using this system.");
        in.close();
    }
}
