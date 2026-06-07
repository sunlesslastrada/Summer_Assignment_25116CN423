import java.util.Scanner;
public class max_fun {
    public int max(int x, int y){
        return (x>y)? x : y;
    }
    public static void main(String[] args){
        max_fun obj = new max_fun();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Maximum of of the two numbers is: "+obj.max(a,b));
        in.close();
    }
}
