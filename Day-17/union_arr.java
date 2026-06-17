import java.util.Scanner;
public class union_arr {
    public static void main(String[] args){
        union_arr obj = new union_arr();
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
        int n = n1+n2;
        int arr[] = new int[n];
        int a=0, b=0 ,x = 0;
        while(a<n1 && b<n2){
            if(arr1[a] < arr2[b]){
                arr[x] = arr1[a];
                x++;
                a++;
            }
            else if(arr1[a] > arr2[b]){
                arr[x] = arr2[b];
                x++;
                b++;
            }
            else{
                arr[x] = arr1[a];
                a++;
                b++;
                x++;
            }
        }
        if(a == n1){
            while(b < n2){
                arr[x] = arr2[b];
                x++;
                b++;
            }
        }
        else{
            while(a < n1){
                arr[x] = arr1[a];
                x++;
                a++;
            }
        }
        System.out.println("Elements of union array:");
        for(int i = 0;i < x;i++)
            System.out.print(arr[i]+", ");
        in.close();
    }
}
