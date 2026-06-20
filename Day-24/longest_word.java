import java.util.Scanner;
public class longest_word {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine().toLowerCase();
        String max ="", c ="";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                if(max.length() < c.length())
                    max = c;
                c ="";
            }
            else
                c+=s.charAt(i);
        }
        if(max.length() < c.length()) max = c;
        System.out.println("Longest word in string: "+max);
        in.close();
    }
}
