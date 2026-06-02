import java.util.Scanner;
public class power {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = in.nextInt();
        System.out.println("Enter the power that "+n+" is to be raised to:");
        int pow = in.nextInt();
        int res = 1, x = pow;;
        while(x>0){
            res*=n;
            x--;
        }
        System.out.println(n+" raised to the power of "+pow+" is: "+res);
        in.close();
    }
}
