import java.util.Scanner;
public class sum_fun {
    public int sum(int x, int y){
        return x+y;
    }
    public static void main(String[] args){
        sum_fun obj = new sum_fun();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is: "+obj.sum(a,b));
        in.close();
    }
}
