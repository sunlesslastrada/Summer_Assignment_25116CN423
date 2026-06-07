import java.util.Scanner;
public class fact_fun {
    public int fact(int x){
        if(x == 1)
            return 1;
        return x*fact(x-1);
    }
    public static void main(String[] args){
        fact_fun obj = new fact_fun();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = in.nextInt();
        System.out.println("Factorial of "+a+" is: "+obj.fact(a));
        in.close();
    }
}
