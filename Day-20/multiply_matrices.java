import java.util.Scanner;
public class multiply_matrices {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of rows and columns of 1st matrix:");
        int r1= in.nextInt();
        int c1= in.nextInt();
        System.out.println("Enter no. of rows and columns of 2nd matrix:");
        int r2= in.nextInt();
        int c2= in.nextInt();
        if(r1<1 ||c1<1 ||r2<1 ||c2<1 ){
            System.out.println("Invalid length. Cannot be negative or 0.");
            System.exit(0);
        }
        if(c1 != r2){
            System.out.println("Multiplication of the two matrices is not possible due to improper orders.");
            System.exit(0);
        }
        int m1[][] = new int[r1][c1];
        System.out.println("Enter "+(r1*c1)+" elements for 1st matrix:");
        for(int i = 0;i < r1;i++)
            for(int j = 0;j <c1;j++)
                m1[i][j]=in.nextInt();
        int m2[][] = new int[r2][c2];
        System.out.println("Enter "+(r2*c2)+" elements for 2nd matrix:");
        for(int i = 0;i < r2;i++)
            for(int j = 0;j <c2;j++)
                m2[i][j]=in.nextInt();
        int s1[][] = new int[r1][c2];
        for(int i = 0;i < r1;i++){
            for(int j = 0;j <c2;j++){
                s1[i][j] = 0;
                for(int k = 0;k < r2;k++){
                    s1[i][j]+=m1[i][k] * m2[k][j];
                }
            }
        }
        System.out.println("Multiplication of matrices is:");
        for(int i = 0;i < r1;i++){
            for(int j = 0;j <c2;j++)
                System.out.print(s1[i][j]+" ");
            System.out.println();
        }
        in.close();
    }
}
