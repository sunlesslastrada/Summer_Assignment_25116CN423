import java.util.Scanner;
public class countd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int n = in.nextInt();
        int count = 0;
        int n1 = n;
        while(n1>0){
            count++;
            n1/=10;
        }
        System.out.println("Number of digits in "+n+" is: "+count);
        in.close();
    }
}
