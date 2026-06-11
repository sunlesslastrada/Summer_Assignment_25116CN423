import java.util.Scanner;
public class reverse_arr {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n= in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements for array:");
        for(int i = 0;i < n;i++)
            arr[i]=in.nextInt();
        int f=0, l=n-1,t;
        while(f<l){
            t = arr[f];
            arr[f] = arr[l];
            arr[l] = t;
            f++;
            l--;
        }
        System.out.println("Elements of reversed array:");
        for(int i = 0;i <  n;i++)
            System.out.print(arr[i]+", ");
        in.close();
    }
}
