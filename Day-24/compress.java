import java.util.Scanner;

public class compress {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine().toLowerCase();
        String o="";
        int c=1,i;
        for(i = 1;i<s.length();i++){
            if(s.charAt(i) != s.charAt(i-1)){
                o+=s.charAt(i-1)+Integer.toString(c);
                c=1;
            }
            else{
                c++;
            }
        }
        o+=s.charAt(i-1)+Integer.toString(c);
        System.out.println("Compressed string: "+o);
        in.close();
    }
}
