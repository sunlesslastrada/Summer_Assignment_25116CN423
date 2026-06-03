import java.util.Scanner;
public class recur_fibonnaci {
    public long fib(int x){
        if(x==1)
            return 0;
        if(x==2)
            return 1;
        return fib(x-1)+fib(x-2);
    }
    public static void main(String[] args){
        recur_fibonnaci obj = new recur_fibonnaci();
        Scanner in = new Scanner(System.in);
        System.out.println("First 20 digits of fibonnaci series are: ");
        for(int i = 1; i<= 20;i++)
            System.out.print(obj.fib(i)+",");
        in.close();
    }
}
