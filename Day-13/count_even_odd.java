import java.util.Scanner;
public class count_even_odd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n= in.nextInt();
        if(n<1){
            System.out.println("Wrong size. Cannot be negative or 0.");
            System.exit(0);
        }
        int arr[] = new int[n], ec=0,oc=0;
        System.out.println("Enter "+n+" elements for array:");
        for(int i = 0;i < n;i++)
            arr[i]=in.nextInt();
        for(int i = 0;i < n; i++){
            if(arr[i]%2 == 0) ec++;
            else oc++;
        }
        System.out.println("Even element count of array: "+ec);
        System.out.println("Odd element count of array: "+oc);
        in.close();
    }
}
