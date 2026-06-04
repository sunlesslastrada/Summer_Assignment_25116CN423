import java.util.Scanner;
public class character_triangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n = in.nextInt();
        System.out.println("Character pyramid with "+n+" rows:");
        char x ;
        for(int i = 1;i <= n;i ++){
            x = 'A';
            for(int j = 1;j <= i;j ++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
        in.close();
    }
}
