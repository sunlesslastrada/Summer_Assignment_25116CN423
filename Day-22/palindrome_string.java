import java.util.Scanner;
public class palindrome_string{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine().toLowerCase();
        int f=0, l=s.length()-1;
        while(f<l){
            if(s.charAt(f) == ' '){
                f++;
                continue;
            }
            if(s.charAt(l) == ' '){
                l--;
                continue;
            }
            if(s.charAt(f) != s.charAt(l)){
                System.out.println("String is not a palindrome.");
                System.exit(0);
            }
            f++;
            l--;
        }
        System.out.println("String is a palindrome.");
        in.close();
    }
}