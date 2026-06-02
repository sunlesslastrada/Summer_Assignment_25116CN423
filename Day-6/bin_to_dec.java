import java.util.Scanner;
public class bin_to_dec {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        long bin = in.nextLong();
        int dec = 0, x=1;
        long n = bin;
        while(n>0){
            dec+= n%10 * x;
            n/=10;
            x*=2;
        }
        System.out.println(bin+" in decimal is: "+dec);
        in.close();
    }
}
