import java.util.Scanner;
public class common_char {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st string:");
        String s1 = in.nextLine().toLowerCase();
        System.out.println("Enter 2nd string:");
        String s2 = in.nextLine().toLowerCase();
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        for(int i = 0;i<s1.length();i++){
            if(Character.isLetter(s1.charAt(i)))
                a1[s1.charAt(i) - 97]++;
        }
        for(int i = 0;i<s2.length();i++){
            if(Character.isLetter(s2.charAt(i)))
                a2[s2.charAt(i) - 97]++;
        }
        System.out.println("List of common characters:");
        for(int i = 0;i< 26;i++){
            if(a1[i] != 0 && a2[i] != 0){
                System.out.println((char)(i+97)+" - "+((a1[i] < a2[i])?a1[i]:a2[i]));
            }
        }
        in.close();
    }
}
