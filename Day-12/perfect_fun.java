import java.util.Scanner;
public class perfect_fun {
    public boolean perfect(int n){
        if(n==1) return false;
        int sumf = 1;
        for(int i = 2;i*i<= n;i++){
            if(n%i==0)
                sumf+=i+(n/i);
        }
        return sumf == n;
    }
    public static void main(String[] args){
        perfect_fun obj = new perfect_fun();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = in.nextInt();
        if(obj.perfect(n))
            System.out.println(n+" is a perfect number.");
        else
            System.out.println(n+" is not a perfect number.");
        in.close();
    }
}
