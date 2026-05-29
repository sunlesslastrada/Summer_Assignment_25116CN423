import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = in.nextInt();
        int n1 = n, rn = 0;
        while(n1>0){
            rn = rn*10 + n1%10;
            n1/=10;
        }
        System.out.println("Reverse of "+n+" is: "+rn);
        in.close();
    }
}
