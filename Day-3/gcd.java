import java.util.Scanner;
public class gcd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a 2 numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        if(a==b){
            System.out.println("GCD of"+a+" and "+b+" is: "+a);
            System.exit(0);
        }
        int max = (a>b)? a:b;
        int min = (a<b)? a:b;
        int i = min;
        while(i>=1){
            if(min%i!=0){
                i--;
                continue;
            }
            if(max%i!=0){
                i--;
                continue;
            }
            break;
        }
        System.out.println("GCD of "+a+" and "+b+" is: "+i);
        in.close();
    }
}
