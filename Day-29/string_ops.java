import java.util.Scanner;
public class string_ops {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("******WELCOME TO STRING OPERATIONS******");
        System.out.println("Choose operation to perform:");
        System.out.println("1- Re-enter new string");
        System.out.println("2- Find length");
        System.out.println("3- Convert to Upper Case and Lower Case");
        System.out.println("4- Count vowels and consanants");
        System.out.println("5- Reverse String");
        System.out.println("6- Check palindrome");
        System.out.println("7- Exit");
        int ch = 1;
        String str;        
        System.out.print("Enter string: ");
        str = in.nextLine();
        while(ch != 7){
            System.out.println("\n*********************************************");
            System.out.print("Enter your choice: ");
            ch = in.nextInt();
            in.nextLine();
            if(ch == 1){
                System.out.print("Enter string: ");
                str = in.nextLine();
            }
            else if(ch == 2){
                System.out.println("Length of "+str+" is: "+str.length());
            }
            else if(ch == 3){
                System.out.println(str+" converted to Upper Case: "+str.toUpperCase());
                System.out.println(str+" converted to Lower Case: "+str.toLowerCase());
            }
            else if(ch == 4){
                char c;
                int vow_c= 0, con_c= 0;
                for(int i = 0;i < str.length(); i++){
                    c = Character.toLowerCase(str.charAt(i));
                    if(!Character.isLetter(str.charAt(i))) 
                        continue;
                    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                        vow_c++;
                    else
                        con_c++;
                }
                System.out.println("Vowel count: "+vow_c);
                System.out.println("Consonant count: "+con_c);
            }
            else if(ch == 5){
                String rev_s = "";
                for(int i = str.length()-1;i>=0;i--)
                    rev_s+=str.charAt(i);
                System.out.println("Reversed string: "+rev_s);
            }
            else if(ch == 6){
                int f=0, l=str.length()-1;
                while(f<l){
                    if(str.charAt(f) == ' '){
                        f++;
                        continue;
                    }
                    if(str.charAt(l) == ' '){
                        l--;
                        continue;
                    }
                    if(str.charAt(f) != str.charAt(l)){
                        System.out.println("String is not a palindrome.");
                        break;
                    }
                    f++;
                    l--;
                }
                if(f==l)
                System.out.println("String is a palindrome.");
            }
            else if(ch!=7){
                System.out.println("Wrong choice. Please choose only from given options.");
            }
        }
        System.out.println("EXITING.");
        System.out.println("Thank you for using this system.");
        in.close();
    }
}