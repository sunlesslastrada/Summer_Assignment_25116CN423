import java.util.Scanner;
public class reverse_pyramid {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n = in.nextInt();
        System.out.println("Reverse pyramid with "+n+" rows:");
        for(int i = 1;i <= n;i ++){
            for(int j = 2;j <= i;j ++)
                System.out.print(" ");
            for(int k = 1;k <= (n-i)*2+1;k ++)
                System.out.print("* ");
            System.out.println();
        }
        in.close();
    }
}
