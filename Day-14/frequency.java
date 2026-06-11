import java.util.Scanner;
public class frequency {
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
        System.out.println("Enter element to find frequency:");
        int s = in.nextInt();
        int freq = 0;
        for(int i = 0;i < n;i++){
            if(arr[i] == s){
                freq++;
            }
        }
        System.out.println("Frequency of "+s+" in array is: "+freq);
        in.close();
    }
}
