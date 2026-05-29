import java.util.Scanner;
public class productd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = in.nextInt();
        int n1 = n, prod = 1;
        while(n1>0){
            prod*=n1%10;
            n1/=10;
        }
        System.out.println("Product of digits of "+n+" is = "+prod);
        in.close();
    }
}
