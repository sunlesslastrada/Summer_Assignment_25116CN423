import java.util.Scanner;
public class count_words {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine();
        int c = 0;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == ' ' && s.charAt(i-1) != ' ')
                c++;
        }
        if(Character.isLetter(s.charAt(s.length()-1))) c++;
        System.out.println("No. of words in string: "+c);
        in.close();
    }
}
