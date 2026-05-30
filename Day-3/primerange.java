import java.util.Scanner;
public class primerange {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter lower limit of range:");
        int l = in.nextInt();
        System.out.println("Enter upper limit of range:");
        int u = in.nextInt();
        boolean res;
        System.out.println("Prime numbers from "+l+" and "+u+" are:");
        for(int j = l;j <= u; j++){
            if(j==1) continue;
            res = false;
            for(int i = 2; i < j/2; i++){
                if(j%i == 0){
                    res = true;
                    break;
                }
            }
            if(!res)
                System.out.print(j+", ");
        }
        in.close();
    }
}
