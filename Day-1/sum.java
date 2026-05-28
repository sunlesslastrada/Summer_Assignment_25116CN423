import java.util.Scanner;
public class sum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 1; i<=n;i++)
            sum+=i;
        System.out.println("Sum of "+n+" natural numbers is: "+sum);
        in.close();
    }
}