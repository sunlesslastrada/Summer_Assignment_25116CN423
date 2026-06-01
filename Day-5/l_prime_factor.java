import java.util.Scanner;
public class l_prime_factor {
    public boolean isprime(int x){
        for(int i = 2; i<x/2;i++)
            if(x%i==0)
                return false;
        return true;

    }
    public static void main(String[] args){
        l_prime_factor obj = new l_prime_factor();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = in.nextInt();
        if(n==1){
            System.out.println("1 does not have any prime factors.");
            System.exit(0);
        }
        for(int i = n;i>1;i--){
            if(n%i == 0 && obj.isprime(i)){
                System.out.println(i+" is the largest prime factor of "+n);
                break;
            }
        }
        in.close();
    }
}
