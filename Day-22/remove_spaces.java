import java.util.Scanner;

public class remove_spaces {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine();
        String ns = "";
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) != ' ')
                ns += s.charAt(i);
        }
        System.out.println("String after removal of spaces is: "+ns);
        in.close();
    }
}
