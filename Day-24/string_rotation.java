import java.util.Scanner;
public class string_rotation {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st string:");
        String s1 = in.nextLine();
        System.out.println("Enter 2nd string:");
        String s2 = in.nextLine();
        if(s1.length() != s2.length()){
            System.out.println("Not rotated strings.");
            System.exit(0);
        }
        String t = s1+s1;
        if(t.contains(s2))
            System.out.println("Rotated strings");
        else
            System.out.println("Not rotated strings.");
        in.close();
    }
}
