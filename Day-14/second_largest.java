import java.util.Scanner;
public class second_largest {
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
        if(n<2){
            System.out.println("Insufficient elements to find second largest.");
            System.exit(0);
        }
        int max = arr[0], smax = arr[0];
        for(int i = 0;i < n;i++){
            if(arr[i] > max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i]>smax)
            smax = arr[i];
        }
        System.out.println("Second largest element of array is: "+smax);
        in.close();
    }
}
