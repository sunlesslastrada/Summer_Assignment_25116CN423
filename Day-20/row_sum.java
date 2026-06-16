import java.util.Scanner;
public class row_sum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of rows and columns of 1st matrix:");
        int r1= in.nextInt();
        int c1= in.nextInt();
        if(r1<1 ||c1<1 ){
            System.out.println("Invalid length. Cannot be negative or 0.");
            System.exit(0);
        }
        int m1[][] = new int[r1][c1];
        System.out.println("Enter "+(r1*c1)+" elements for 1st matrix:");
        for(int i = 0;i < r1;i++)
            for(int j = 0;j <c1;j++)
                m1[i][j]=in.nextInt();
        int s1[][] = new int[r1][1];
        for(int i = 0;i < r1;i++){
            s1[i][0] = 0;
            for(int j = 0;j < c1;j++)
                s1[i][0]+=m1[i][j];
        }
        System.out.println("Sum of matrices is:");
        for(int i = 0;i < r1;i++){
            System.out.print(s1[i][0]+" ");
            System.out.println();
        }
        in.close();
    }
}
