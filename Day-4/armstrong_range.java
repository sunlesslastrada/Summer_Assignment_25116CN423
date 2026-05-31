import java.util.Scanner;
public class armstrong_range {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter lower limit of range:");
        int ll = in.nextInt();
        System.out.println("Enter upper limit of range:");
        int ul = in.nextInt();
        int n,l,n1,an;
        String s;
        System.out.println("Armstrong numbers between "+ll+" and "+ul+" are:");
        for(int i = ll;i <= ul; i++){
            n = i;
            s = String.valueOf(n);
            l = s.length();
            n1 = n;
            an=0;
            while(n1>0){
                an=an+(int)Math.pow(n1%10,l);
                n1/=10;
            }
            if(an == n)
                System.out.print(n+",");
        }
        in.close();
    }
}
