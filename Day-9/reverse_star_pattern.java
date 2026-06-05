import java.util.Scanner;
public class reverse_star_pattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n = in.nextInt();
        System.out.println("Reverse star pattern with "+n+" rows:");
        for(int i = 1;i <= n;i ++){
            for(int j = n;j >= i;j --)
                System.out.print("* ");
            System.out.println();
        }
        in.close();
    }
}
