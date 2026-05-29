import java.util.Scanner;
public class sumd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = in.nextInt();
        int sum = 0, n1 = n;
        while(n1>0){
            sum+=n1%10;
            n1/=10;
        }
        System.out.println("Sum of digits of "+n+" is = "+sum);
        in.close();
    }
}
