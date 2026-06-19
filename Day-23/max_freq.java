import java.util.Scanner;

public class max_freq {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st string:");
        String s = in.nextLine().toLowerCase();
        int[] arr = new int[26];
        for(int i = 0;i < s.length();i++){
            if(Character.isLetter(s.charAt(i)))
                arr[s.charAt(i)-97]++;
        }
        int mf = 0;
        for(int i = 0;i < 26;i++){
            if(arr[i] > arr[mf])
                mf = i;
        }
        System.out.println("Most occuring character of string: "+(char)(mf+97));
        in.close();
    }
}
