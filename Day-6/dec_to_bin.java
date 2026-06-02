import java.util.Scanner;
public class dec_to_bin {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int dec = in.nextInt();
        int n = dec,c=0;
        long bin = 0;
        while(n>0){
            bin = bin + n%2 * (int)Math.pow(10,c);
            c++;
            n/=2;
        }
        System.out.println(dec+" in binary is: "+bin);
        in.close();
    }
}
