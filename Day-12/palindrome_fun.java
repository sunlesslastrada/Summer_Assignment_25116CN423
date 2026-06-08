import java.util.Scanner;
public class palindrome_fun {
    public boolean palindrome(int x){
        int rev = 0, n = x;
        while(n>0){
            rev= rev*10 + n%10;
            n/=10;
        }
        return x==rev;
    }
    public static void main(String[] args){
        palindrome_fun obj = new palindrome_fun();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = in.nextInt();
        if(obj.palindrome(n))
            System.out.println(n+" is a palindrome number.");
        else
            System.out.println(n+" is not a palindrome number.");
        in.close();
    }
}
