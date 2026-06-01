import java.util.Scanner;
public class perfect_number {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = in.nextInt();
        if(n==1){
            System.out.println("1 is not a perfect number.");
            System.exit(0);
        }
        int sumf = 1;
        for(int i =2;i < n;i++)
            if(n%i==0) sumf = sumf + i;
        if(sumf == n)
            System.out.println(n+" is a perfect number.");
        else
            System.out.println(n+" is not a perfect number.");
        in.close();
    }
}
