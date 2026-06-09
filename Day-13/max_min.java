import java.util.Scanner;
public class max_min {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n= in.nextInt();
        if(n<1){
            System.out.println("Wrong size. Cannot be negative or 0.");
            System.exit(0);
        }
        int arr[] = new int[n], max=0,min=0;
        System.out.println("Enter "+n+" elements for array:");
        for(int i = 0;i < n;i++)
            arr[i]=in.nextInt();
        max=arr[0];
        min=arr[0];
        for(int i = 0;i < n; i++){
            if(arr[i] <= max) max = arr[i];
            if(arr[i] >= min) min = arr[i];
        }
        System.out.println("Maximum element of array: "+max);
        System.out.println("Minimum element of array: "+min);
        in.close();
    }
}
