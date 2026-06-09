import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n= in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements for array:");
        for(int i = 0;i < n;i++)
            arr[i]=in.nextInt();
        System.out.println("Elements of array:");
        for(int i = 0;i <  n;i++)
            System.out.print(arr[i]+", ");
        in.close();
    }
}
