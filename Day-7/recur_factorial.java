import java.util.Scanner;
public class recur_factorial {
    public int fact(int x){
        if(x==1 || x == 0)
            return 1;
        return x*fact(x-1);
    }
    public static void main(String[] args){
        recur_factorial obj = new recur_factorial();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = in.nextInt();
        int res = obj.fact(n);
        System.out.println("Factorial of "+n+" is: "+res);
        in.close();
    }
}
