import java.util.Scanner;
public class sort_bylength {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of names:");
        int n = in.nextInt();
        in.nextLine();
        String[] arr = new String[n];
        System.out.println("Enter "+n+" names: ");
        for(int i = 0;i<n;i++)
            arr[i] = in.nextLine();
        String t;
        for(int i = 0;i < n-1;i++){
            for(int j = 0;j < n-i-1;j++){
                if(arr[j].length()>arr[j+1].length()){
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println("Names sorted alphabetically: ");
        for(int i = 0;i<n;i++)
            System.out.println(arr[i]);
        in.close();
    }
}
