import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = in.nextInt();
        int n1 = n, rn = 0;
        while(n1>0){
            rn = rn*10 + n1%10;
            n1/=10;
        }
        if(rn == n)
            System.out.println(n+" is a palindrome.");
        else
            System.out.println(n+" is not a palindrome.");
        in.close();
    }
}
