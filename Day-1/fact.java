import java.util.Scanner;
public class fact {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int n = in.nextInt();
        int fact = 1;
        for(int i = 1; i<=n;i++)
            fact*=i;
        System.out.println("Factorial of "+n+" natural numbers is: "+fact);
        in.close();
    }
}
