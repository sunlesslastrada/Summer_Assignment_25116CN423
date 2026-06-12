import java.util.Scanner;
public class sum_pair {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n= in.nextInt();
        if(n<1){
            System.out.println("Invalid length. Cannot be negative or 0.");
            System.exit(0);
        }
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements for array:");
        for(int i = 0;i < n;i++)
            arr[i]=in.nextInt();
        System.out.println("Enter target sum:");
        int t_sum= in.nextInt();
        for(int i = 0;i < n-1;i++){
            for(int j = i+1; j < n;j++){
                if(arr[i]+arr[j] == t_sum){
                    System.out.println("Elements "+arr[i]+" and "+arr[j]+" at indices "+i+" and "+j+" add up to targte sum "+t_sum+".");
                    System.exit(0);
                }
            }
        }
        in.close();
    }
}