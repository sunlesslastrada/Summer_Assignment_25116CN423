import java.util.Scanner;
public class no_repeats {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine().toLowerCase();
        int[] arr = new int[26];
        int c;
        for(int i = 0;i < s.length()-1; i++){
            c=0;
            if(Character.isLetter(s.charAt(i)) && arr[s.charAt(i)-97] == 0){
                arr[s.charAt(i)-97]++;
                for(int j = i+1;j < s.length();j++){
                    if(s.charAt(i) == s.charAt(j)){
                        c=1;
                         break;
                    }
                }
                if(c == 0){
                    System.out.println(s.charAt(i)+" is the first non-repeating character in string.");
                    System.exit(0);
                }
            }
        }
        System.out.println("All characters appear atleast twice, hence no non-repeating characters in string.");
        in.close();
    }
}
