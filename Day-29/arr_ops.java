import java.util.Scanner;
public class arr_ops {
    public static void main(String[] args) throws InterruptedException{
        Scanner in = new Scanner(System.in);
        System.out.println("******WELCOME TO ARRAY OPERATIONS******");
        System.out.println("Choose operation to perform:");
        System.out.println("1- Display array");
        System.out.println("2- Input array");
        System.out.println("3- Insert element");
        System.out.println("4- Delete element");
        System.out.println("5- Search element");
        System.out.println("6- Sort array");
        System.out.println("7- Exit");
        int ch = 1;
        int arr[] = new int[1000];
        int size = 0,e,x,pos;
        while(ch != 7){
            System.out.println("\n*********************************************");
            System.out.print("Enter your choice: ");
            ch = in.nextInt();
            if(ch == 1){
                if(size < 1){
                    System.out.println("Empty array. Enter some elements.");
                    continue;
                }
                System.out.println("Array: ");
                for(int i = 0;i<size;i++){
                    System.out.print(arr[i]);
                    if(i!=size-1)
                        System.out.print(",");
                    else
                        System.out.println();
                }
            }
            else if(ch == 2){
                if(size != 0){
                    System.out.print("Array already has element, inputing array will overwrite previous elements. Enter 0 if u wish to proceed:");
                    ch = in.nextInt();
                    if(ch == 0){
                        System.out.println("Canceling, array input.");
                        continue;
                    }
                }
                System.out.print("Enter number of elements: ");
                size = in.nextInt();
                System.out.println("Enter "+size+" elements for array:");
                for(int i = 0;i<size;i++)
                    arr[i] = in.nextInt();
                System.out.println("Input complete.");
            }
            else if(ch == 3){
                if(size == 1000){
                    System.out.println("Array has no space for insertion. Make space for insertion.");
                    continue;
                }
                System.out.print("Enter element to insert: ");
                e = in.nextInt();
                System.out.print("Enter index to insert at: ");
                x = in.nextInt();
                if(x>size){
                    x=size;
                    System.out.println("Index goes beyond current array size, hence inserting at end of array.");
                }
                for(int i = size;i>x;i--)
                    arr[i] = arr[i-1];
                arr[x] = e;
                size++;
                System.out.println("Inserted. No. of elements in array: "+size);
            }
            else if(ch == 4){
                if(size == 0){
                    System.out.println("Array has no element for deletion. Add elements for deletion.");
                    continue;
                }
                System.out.print("Enter index to delete at: ");
                x = in.nextInt();
                for(int i = x;i<size-1;i++)
                    arr[i] = arr[i+1];
                size--;
                System.out.println("Deleted. No. of elements in array: "+size);
            }
            else if(ch == 5){
                System.out.println("Enter search element:");
                x = in.nextInt();
                pos = -1;
                for(int i = 0;i < size;i++){
                    if(arr[i] == x){
                    pos = i;
                    break;
                    }
                }
                if(pos == -1)
                    System.out.println(x+" was not found in array.");
                else
                    System.out.println(x+" found in array at index "+pos+".");
            }
            else if(ch == 6){
                System.out.print("Sorting");
                for(int j = 0;j<3;j++){
                    Thread.sleep(1000);
                    System.out.print(".");
                }
                int t,s=0;
                for(int i = 0;i < size-1;i++){
                    for(int j = 0;j < size-i-1;j++){
                        if(arr[j] > arr[j+1]){
                            t = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = t;
                            s++;
                        }
                    }
                    if(s==0) break;
                }
                System.out.println("Sorted array: ");
                for(int i = 0;i<size;i++){
                    System.out.print(arr[i]);
                    if(i!=size-1)
                        System.out.print(",");
                    else
                        System.out.println();
                }
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
