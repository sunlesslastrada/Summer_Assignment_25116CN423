import java.util.Scanner;
public class symmetric_matrix {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of rows and columns of 1st matrix:");
        int r1= in.nextInt();
        int c1= in.nextInt();
        if(r1<1 || c1<1 ){
            System.out.println("Invalid length. Cannot be negative or 0.");
            System.exit(0);
        }
        if(r1 != c1){
            System.out.println("Non-square matrix. Cannot be a symmetric matrix.");
            System.exit(0);
        }
        int m1[][] = new int[r1][c1];
        System.out.println("Enter "+(r1*c1)+" elements for 1st matrix:");
        for(int i = 0;i < r1;i++)
            for(int j = 0;j <c1;j++)
                m1[i][j]=in.nextInt();
        for(int i = 0;i < r1; i++){
            for(int j = i+1;j < c1; j++){
                if(m1[i][j] != m1[j][i]){
                    System.out.println("Not a symmetric matrix.");
                    System.exit(0);
                }
            }
        }
        System.out.println("It is a symmetric matrix.");
        in.close();
    }
}
