import java.util.Scanner;
public class toUpper {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine();
        String ns = "";
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
                ns+=(char)(s.charAt(i)-32);
            else
                ns+=s.charAt(i);
        }        
        System.out.println("String with all lowercase as uppercase: "+ns);
        in.close();
    }
}
