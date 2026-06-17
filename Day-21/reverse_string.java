import java.util.Scanner;
public class reverse_string {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine();
        String rev_s = "";
        for(int i = s.length()-1;i>=0;i--)
            rev_s+=s.charAt(i);
        System.out.println("Reversed string: "+rev_s);
        in.close();
    }
}
