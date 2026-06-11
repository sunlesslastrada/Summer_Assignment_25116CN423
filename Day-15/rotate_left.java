import java.util.Scanner;
public class rotate_left {
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
        System.out.println("Enter number of times array has to be rotated left:");
        int r = in.nextInt();
        int reva[] = new int[n];
        int x = 0;
        for(int i = r;i < n;i++){
            reva[x] = arr[i];
            x++;
        }
        for(int i = 0;i < r;i++){
            reva[x] = arr[i];
            x++;
        }
        System.out.println("Elements of rotated array:");
        for(int i = 0;i <  n;i++)
            System.out.print(reva[i]+", ");
        in.close();
    }
}
