import java.util.Scanner;
public class set_bits {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int dec = in.nextInt();
        int n = dec, c= 0;
        while(n>0){
            if(n%2 == 1)
                c++;
            n/=2;
        }
        System.out.println("Number of set bits in "+dec+" is: "+c);        
        in.close();
    }
}
