import java.util.Scanner;
public class character_pyramid {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n = in.nextInt();
        System.out.println("Character pyramid with "+n+" rows:");
        char c;
        for(int i = 1;i <= n;i ++){
            c='A';
            for(int j = n-1;j >= i;j --)
                System.out.print(" ");
            for(int k = 1;k <= i;k ++){
                System.out.print(c+" ");
                c++;
            }
            c--;
            for(int l = i-1;l >= 1;l --){
                c--;
                System.out.print(c+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
