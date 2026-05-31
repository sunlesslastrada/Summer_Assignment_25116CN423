public class fibonacci_series {
    public static void main(String[] args){
        System.out.print("First 50 term of the fibonacci series is as follow:\n0,1,");
        long ft=0, st=1, tt;
        for(int i = 1;i <= 48;i++){
            tt = ft + st;
            ft=st;
            st=tt;
            System.out.print(tt+",");
        }
    }
}
