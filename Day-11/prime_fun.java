import java.util.Scanner;
public class prime_fun {
    public boolean prime(int x){
        for(int i = 2;i <= x/2;i ++)
            if(x%i == 0)
                return false;
        return true;
    }
    public static void main(String[] args){
        prime_fun obj = new prime_fun();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = in.nextInt();
        if(obj.prime(a))
            System.out.println(a+" is a prime number.");
        else
            System.out.println(a+" is not a prime number.");
        in.close();
    }
}
