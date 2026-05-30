import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int n = in.nextInt();
        boolean res = false;
        for(int i = 2; i < n/2; i++){
            if(n%i == 0){
                res = true;
                break;
            }
        }
        if(n==1 || res)
            System.out.println(n+" is not a prime number.");
        else
            System.out.println(n+" is a prime number.");
        in.close();
    }
}
