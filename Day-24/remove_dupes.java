import java.util.Scanner;
public class remove_dupes {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine().toLowerCase();
        String ns = ""+s.charAt(0);
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) != s.charAt(i-1))
                ns+=s.charAt(i);
        }
        System.out.println("String after removal of duplicate characters: "+ns);
        in.close();
    }
}
