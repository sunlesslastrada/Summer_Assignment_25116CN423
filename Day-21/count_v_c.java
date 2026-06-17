import java.util.Scanner;
public class count_v_c {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine();
        char ch;
        int vow_c= 0, con_c= 0;
        for(int i = 0;i < s.length(); i++){
            ch = Character.toLowerCase(s.charAt(i));
            if(!Character.isLetter(s.charAt(i))) 
                continue;
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                vow_c++;
            else
                con_c++;
        }
        System.out.println("Vowel count: "+vow_c);
        System.out.println("Consonant count: "+con_c);
        in.close();
    }
}
