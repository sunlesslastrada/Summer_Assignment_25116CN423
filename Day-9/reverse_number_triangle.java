import java.util.Scanner;
public class reverse_number_triangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n = in.nextInt();
        System.out.println("Reverse number pyramid with "+n+" rows:");
        for(int i = n;i >= 1;i --){
            for(int j = 1;j <= i;j ++)
                System.out.print(j+" ");
            System.out.println();
        }
        in.close();
    }
}
