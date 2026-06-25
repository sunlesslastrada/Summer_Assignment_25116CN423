import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("******WELCOME TO CALCULATOR******");
        System.out.println("Choose operation to perform and enter values:");
        System.out.println("1- Addition");
        System.out.println("2- Subtraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");
        System.out.println("5- Exponent");
        System.out.println("6- Exit");
        int ch = 1;
        while(ch != 6){
            System.out.println("\n*********************************************");
            double res,e;
            System.out.print("Enter your choice: ");
            ch = in.nextInt();
            if(ch == 1){
                res = 0;
                e=1;
                System.out.println("Enter your numbers to perform addition, you can keep entering the numbers for however long you want, and enter 0 when you wish to stop.");
                while(e!=0){
                    System.out.print(res+" + ");
                    e = in.nextDouble();
                    res+=e;
                    System.out.println("Sum = "+res);
                }
            }
            else if (ch == 2){
                res = 0;
                e=1;
                System.out.println("Enter your numbers to perform subtraction, you can keep entering the numbers for however long you want, and enter 0 when you wish to stop.");
                while(e!=0){
                    System.out.print(res+" - ");
                    e = in.nextDouble();
                    res-=e;
                    System.out.println("Difference = "+res);
                }
            }
            else if (ch == 3){
                res = 1;
                e=0;
                System.out.println("Enter your numbers to perform multiplication, you can keep entering the numbers for however long you want, and enter 1 when you wish to stop.");
                while(e!=1){
                    System.out.print(res+" x ");
                    e = in.nextDouble();
                    res*=e;
                    System.out.println("Product = "+res);
                }
            }
            else if (ch == 4){
                double r;
                System.out.println("Enter your numbers to perform division, you can keep entering the numbers for however long you want, and enter 1 when you wish to stop.");
                e = in.nextDouble();
                res = e;
                while(e!=1){
                    System.out.print(res+" / ");
                    e = in.nextDouble();
                    if(e == 0){
                        System.out.println("Cannot divide by 0.");
                        continue;
                    }
                    r = res%e;
                    res/=e;
                    System.out.println("Division = "+res);
                    System.out.println("Remainder = "+r);
                }
            }
            else if(ch == 5){
                System.out.print("Base: ");
                double b = in.nextDouble();
                System.out.print("Exponent: ");
                e = in.nextDouble();
                res = Math.pow(b,e);
                System.out.println(b+" raised to the power of "+e+" is: "+res);
            }
            else if(ch!=6){
                System.out.println("Wrong choice. Please choose only from given options.");
            }
        }
        System.out.println("EXITING.");
        System.out.println("Thank you for using this system.");
        in.close();
    }   
}
