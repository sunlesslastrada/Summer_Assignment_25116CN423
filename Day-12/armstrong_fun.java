import java.util.Scanner;
public class armstrong_fun {
    public boolean armstrong(int x){
        int n = x,arm=0;
        String s = String.valueOf(n);
        int l = s.length();
        while(n>0){
            arm=arm+(int)Math.pow(n%10,l);
            n/=10;
        }
        return x == arm;
    }
    public static void main(String[] args){
        armstrong_fun obj = new armstrong_fun();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = in.nextInt();
        if(obj.armstrong(n))
            System.out.println(n+" is a armstrong number.");
        else
            System.out.println(n+" is not a armstrong number.");
        in.close();
    }
}
