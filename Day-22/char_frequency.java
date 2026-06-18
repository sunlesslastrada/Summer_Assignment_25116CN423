import java.util.Scanner;
public class char_frequency {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine().toLowerCase();
        System.out.println("Enter character to find its frequency: ");
        char ch = Character.toLowerCase(in.next().charAt(0));
        int c = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == ch)
                c++;
        }
        System.out.println("Frequecny of "+ch+" in given string is: "+c);
        in.close();
    }
}
