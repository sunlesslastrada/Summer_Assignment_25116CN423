import java.util.Scanner;
public class duplicates {
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
        int c = 0,j;
        for(int i = 0;i < n-1;i++){
            j = i;
            if(arr[j] == arr[i]){
                c++;
                while(arr[j] == arr[i]){
                    j++;
                }
                i=j;
            }
        }
        System.out.println("Number of elements that have duplicates are: "+c);
        in.close();
    }
}
