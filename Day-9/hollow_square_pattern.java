import java.util.Scanner;
public class hollow_square_pattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of side of square:");
        int n = in.nextInt();
        System.out.println("Hollow square with side length "+n+" :");
        char c;
        for(int i = 1;i <= n;i ++){
            c = ' ';
            System.out.print("* ");
            if(i == 1 || i == n)
                c = '*';
            for(int j = 1;j <= n-2;j ++)
                System.out.print(c+" ");
            System.out.println("* ");

        }
        in.close();
    }
}
