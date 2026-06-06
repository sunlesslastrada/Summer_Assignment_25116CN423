import java.util.Scanner;
public class number_pyramid {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n = in.nextInt();
        System.out.println("Number pyramid with "+n+" rows:");
        for(int i = 1;i <= n;i ++){
            for(int j = n-1;j >= i;j --)
                System.out.print(" ");
            for(int k = 1;k <= i;k ++)
                System.out.print(k+" ");
            for(int l = i-1;l >= 1;l --)
                System.out.print(l+" ");
            System.out.println();
        }
        in.close();
    }
}
