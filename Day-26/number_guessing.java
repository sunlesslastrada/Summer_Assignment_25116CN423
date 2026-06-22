import java.util.Scanner;
public class number_guessing {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("******WELCOME TO NUMBER GUESSING GAME******");
        System.out.println("RULES-");
        System.out.println("->Think of a number between 1 and 1000.");
        System.out.println("->Answer prompted question with y for 'Yes' and n for 'no'.");
        System.out.println("->If the the number prompted is equal to you number, then answer yes, since its is technically not greater.");
        System.out.println("ENJOY!!");
        char ans;
        int f = 1, l =1000,mid;
        while(f<l){
            mid = (f+l)/2;
            System.out.println("Is your number greater than "+mid);
            ans = in.nextLine().toLowerCase().charAt(0);
            if(ans == 'y')
                f = mid+1;
            else if (ans == 'n')
                l = mid-1;
            else{
                System.out.println("Enter valid answer, y for 'Yes' and n for 'no'.");
                continue;
            }
        }
        System.out.println("We think, your number is: "+f);
        in.close();
    }
}
