import java.util.Scanner;
public class strong_number {
    public int factorial(int x){
        if(x==1) return 1;
        return x*factorial(x-1);
    }
    public static void main(String[] args){
        strong_number obj = new strong_number();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = in.nextInt();
        int n1 = n, sn = 0;
        while(n1 > 0){
            sn = sn + obj.factorial(n1%10);
            
            n1/=10;
        }
        if(sn == n)
            System.out.println(n+ " is a strong number.");
        else
            System.out.println(n+ " is not a strong number.");
        in.close();
    }
}
