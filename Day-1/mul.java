import java.util.Scanner;
public class mul {
    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int n = in.nextInt();
        System.out.println("Multiplication table of "+n+" is:");
        for(int i = 1; i<=10;i++)
        System.out.println(n+" x "+i+" = "+(n*i));
        in.close();
    }
}
