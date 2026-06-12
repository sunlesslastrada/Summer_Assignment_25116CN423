import java.util.Scanner;
public class remove_duplicates {
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
        int dup[] = new int[n];
        int x = 0, l=n-1;
        dup[x] = arr[x];
        for(int i = 1;i < n;i++){
            if(arr[i] != dup[x]){
                x++;
                dup[x] = arr[i];
            }
            else{
                dup[l] = arr[i];
                l--;
            }
        }
        System.out.println("Elements of array after removal of duplicates:");
        for(int i = 0;i <= x;i++)
            System.out.print(dup[i]+", ");
        in.close();
    }
}
