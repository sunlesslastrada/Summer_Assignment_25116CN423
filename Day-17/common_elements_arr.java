import java.util.Scanner;
public class common_elements_arr {
    public static void main(String[] args){
        common_elements_arr obj = new common_elements_arr();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of 1st array:");
        int n1= in.nextInt();
        if(n1<1){
            System.out.println("Invalid length. Cannot be negative or 0.");
            System.exit(0);
        }
        int arr1[] = new int[n1];
        System.out.println("Enter "+n1+" elements for 1st sorted array:");
        for(int i = 0;i < n1;i++)
            arr1[i]=in.nextInt();
        System.out.println("Enter size of 2nd array:");
        int n2= in.nextInt();
        if(n2<1){
            System.out.println("Invalid length. Cannot be negative or 0.");
            System.exit(0);
        }
        int arr2[] = new int[n2];
        System.out.println("Enter "+n2+" elements for 2nd sorted array:");
        for(int i = 0;i < n2;i++)
            arr2[i]=in.nextInt();
        int n = (n1<n2)? n1 : n2;
        int arr[] = new int[n];
        int x = 0,a=0,j=0;
        while(j<n2 && a<n1){
            if(arr1[a] == arr2[j]){
                arr[x] = arr2[j];
                a++;
                j++;
                x++;
            }
            else if(arr1[a] < arr2[j])
                a++;
            else
                j++;
        }
        System.out.println("Common elements of array:");
        for(int i = 0;i < x;i++)
            System.out.print(arr[i]+", ");
        in.close();
    }
}
