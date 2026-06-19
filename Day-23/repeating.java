import java.util.Scanner;

public class repeating {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine().toLowerCase();
        for(int i = 0;i < s.length()-1; i++){
            for(int j = i+1;j < s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    System.out.println(s.charAt(i)+" is the first repeating character in given string.");
                    System.exit(0);
                }
            }
        }
        System.out.println("No repeating characters in string.");
        in.close();
    }
}
