import java.util.Scanner;
public class recur_reverse {
    public int reverse(int x, int rev){
        if(x==0)
            return rev;
        //rev= rev*10 + x%10;
        //x/=10;
        return reverse(x/10,rev*10 + x%10);
    }
    public static void main(String[] args){
        recur_reverse obj = new recur_reverse();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = in.nextInt();
        System.out.println("Reverse of "+n+" is: "+obj.reverse(n,0));
        in.close();
    }
}
