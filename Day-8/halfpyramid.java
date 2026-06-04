import java.util.Scanner;
public class halfpyramid {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n = in.nextInt();
        System.out.println("Half pyramid with "+n+" rows:");
        for(int i = 1;i <= n;i ++){
            for(int j = 1;j <= i;j ++)
                System.out.print("* ");
            System.out.println();
        }
        in.close();
    }
}
