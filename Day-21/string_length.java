import java.util.Scanner;
public class string_length {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine();
        int l=0;
        for(char c : s.toCharArray())
            l++;
        // for(int i = 0;;i++){         //using exception handling
        //     try{
        //         s.charAt(i);
        //         l++;
        //     }
        //     catch(Exception e){
        //         break;
        //     }
        // }
        System.out.println("Length of string: "+l);
        in.close();
    }
}
