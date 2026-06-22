import java.util.Scanner;
public class vote_eligibilty {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("******WELCOME TO VOTER'S ELIGIBILITY SYSTEM******");
        System.out.println("This system checks the eligibility of an individual for voting in India.");
        System.out.println("Let's begin:");
        String name,country,gender;
        int age;
        int ch = 1,nos=1;
        while(ch==1){
            System.out.println("\nEnter details about Individual "+nos);
            System.out.print("Enter name: ");
            name = in.nextLine();
            System.out.print("Enter gender: ");
            gender = in.nextLine();
            System.out.print("Enter country of origin: ");
            country = in.nextLine();
            System.out.print("Enter age(years): ");
            age = in.nextInt();
            while(age<0){
                System.out.print("Age cannot be less than 0. Re-enter age: ");
                age = in.nextInt();
            }
            System.out.println("\nIndividual "+nos+" :-");
            System.out.println("Name: "+name);
            System.out.println("Gender: "+gender);
            System.out.println("Country of origin: "+country);
            System.out.println("Age: "+age);
            if(age>=18 && country.toLowerCase().equals("india"))
                System.out.println("Individual is of age and a citizen of India. Hence can vote.");
            else if(age<18)
                System.out.println("Individual is not of age yet. "+(18-age)+" years to go, before voting.");
            else if(!country.toLowerCase().equals("india"))
                System.out.println("Individual is not a citizen of India, so cannot vote.");
            System.out.println("Enter 1 to re-enter next individual, or any other number to exit");
            ch = in.nextInt();
            nos++;
            in.nextLine();
        }
        System.out.println("\n ****THE END****");
        in.close();
    }
}
