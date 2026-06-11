import java.util.Scanner;
public class linear_search {
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
        int s = in.nextInt();
        int pos = -1;
        for(int i = 0;i < n;i++){
            if(arr[i] == s){
                pos = i;
                break;
            }
        }
        if(pos == -1)
            System.out.println(s+" was not found in array.");
        else
            System.out.println(s+" found in array at index "+pos+".");
        in.close();
    }
}
