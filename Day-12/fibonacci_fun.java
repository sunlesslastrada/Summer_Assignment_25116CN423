import java.util.Scanner;
public class fibonacci_fun {
    public int fib(int x){
        if(x==1) return 0;
        if(x==2) return 1;
        int ft=0,st=1,tt=1;
        for(int i = 3;i<=x;i++){
            tt=ft+st;
            ft=st;
            st=tt;
        }
        return tt;
    }
    public static void main(String[] args){
        fibonacci_fun obj = new fibonacci_fun();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter desired term of fibonnaci series:");
        int n = in.nextInt();
        System.out.println(n+" term of fibonacci series is: "+obj.fib(n));
        in.close();
    }
}
