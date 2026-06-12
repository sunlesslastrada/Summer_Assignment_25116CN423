import java.util.Scanner;
public class max_frequency {
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
        int c=0,c1,e=arr[0];
        for(int i = 0;i < n;i++){
            c1=0;
            for(int j = i;j < n;j++){
                if(arr[j] == arr[i])
                    c1++;
            }
            if(c1>c){
                e = arr[i];
                c = c1;
            }
            if(c == n){
                System.out.println("Element of array with most frequency is: "+e);
                System.exit(0);
            }
        }
        System.out.println("Element of array with most frequency is: "+e);
        in.close();
    }
}
