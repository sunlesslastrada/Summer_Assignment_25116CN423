import java.util.Scanner;
public class recur_sumd {
    public int sumd(int x, int sum){
        if(x == 0)
            return sum;
        sum+=x%10;
        x/=10;
        return sumd(x,sum);
    }
    public static void main(String[] args){
        recur_sumd obj = new recur_sumd();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = in.nextInt();
        System.out.println("Sum of digits of "+n+" is: "+obj.sumd(n,0));
        in.close();
    }
}
