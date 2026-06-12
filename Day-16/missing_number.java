import java.util.Scanner;
public class missing_number {
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
        int sum = 0;
        for(int i = 0;i < n;i++)
            sum+=arr[i];
        System.out.println("Missing Element of array is: "+((n+1)*(n+2)/2 - sum));
        in.close();
    }
}
