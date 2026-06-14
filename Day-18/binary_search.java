import java.util.Scanner;
public class binary_search {
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
        System.out.println("Enter search element:");
        int t = in.nextInt();
        int f=0, l = arr.length-1,mid,pos=-1;
        while(pos == -1 && f<=l){
            mid = (f+l)/2;
            if(arr[mid] == t) pos = mid;
            else if(arr[mid] > t) l = mid-1;
            else f = mid+1;
        }
        if(pos == -1)
            System.out.println(t+" was not found in array.");
        else
            System.out.println(t+" found in array at index "+pos+".");
        in.close();
    }
}
