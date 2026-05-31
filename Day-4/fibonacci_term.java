import java.util.Scanner;
public class fibonacci_term {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the term of fibonacci series desired:");
        int n = in.nextInt();
        if(n==1){
            System.out.println(n+" term of the fibonnaci series is : 0");
            in.close();
            System.exit(0);
        }
        if(n==2){
            System.out.println(n+" term of the fibonnaci series is : 1");
            in.close();
            System.exit(0);
        }
        long ft=0, st=1, tt=0;
        for(int i = 3;i <= n; i++){
            tt = ft + st;
            ft = st;
            st = tt;
        }
        System.out.println(n+" term of the fibonnaci series is :"+tt);
        in.close();
    }
}
