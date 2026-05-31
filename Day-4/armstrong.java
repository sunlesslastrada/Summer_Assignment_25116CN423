import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = in.nextInt();
        String s = String.valueOf(n);
        int l = s.length();
        int n1 = n,an=0;
        while(n1>0){
            an=an+(int)Math.pow(n1%10,l);
            n1/=10;
        }
        if(an == n)
            System.out.println(n+" is an Armstrong number.");
        else
            System.out.println(n+" is not an Armstrong number.");
        in.close();
    }
}
