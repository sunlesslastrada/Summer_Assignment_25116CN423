import java.util.Scanner;
public class selection_sort {
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
        int t,min;
        for(int i = 0;i < n-1;i++){
            min = i;
            for(int j = i+1;j < n;j++){
                if(arr[min] > arr[j])
                    min = j;
            }
            t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }
        System.out.println("Elements of sorted rray:");
        for(int i = 0;i <  n;i++)
            System.out.print(arr[i]+", ");
        in.close();
    }
}
