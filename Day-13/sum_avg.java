import java.util.Scanner;
public class sum_avg {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n= in.nextInt();
        if(n<1){
            System.out.println("Invalid length. Cannot be negative or 0.");
            System.exit(0);
        }
        int arr[] = new int[n], sum=0;
        System.out.println("Enter "+n+" elements for array:");
        for(int i = 0;i < n;i++){
            arr[i]=in.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum of elements of array: "+sum);
        System.out.println("Average of elements of array: "+((float)sum/n));
        in.close();
    }
}
