import java.util.Scanner;
public class lcm {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a 2 numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int max = (a>b)? a:b;
        int min = (a<b)? a:b;
        int i = max;
        while(i%min!=0)
            i+=max;
        System.out.println("LCM of "+a+" and "+b+" is: "+i);
        in.close();
    }
}
