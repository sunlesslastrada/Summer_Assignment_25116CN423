import java.util.Scanner;

public class anagram {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st string:");
        String s1 = in.nextLine().toLowerCase();
        System.out.println("Enter 2nd string:");
        String s2 = in.nextLine().toLowerCase();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i = 0;i < s1.length();i++){
            if(Character.isLetter(s1.charAt(i)))
                arr1[s1.charAt(i)-97]++;
        }
        for(int i = 0;i < s2.length();i++){
            if(Character.isLetter(s2.charAt(i)))
                arr2[s2.charAt(i)-97]++;
        }
        for(int i = 0;i < 26;i++){
            if(arr1[i] != arr2[i]){
                System.out.println("Strings are not anagrams.");
                System.exit(0);
            }
        }
        System.out.println("Strings are anagram.");
        in.close();
    }
}
