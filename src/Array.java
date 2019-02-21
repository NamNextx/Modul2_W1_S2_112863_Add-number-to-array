import java.sql.SQLOutput;
import java.util.Scanner;

/*
 * Process add number to array (position )*/
public class Array {

    public static void main(String[] args) {
        System.out.println("Process add index to array");
        Scanner sc = new Scanner(System.in);
        int length;
        do {
            System.out.print("Enter length of array: ");
            length = sc.nextInt();
            if (length > 20) {
                System.out.println("Pls input length less than 20");
            }
        } while (length > 20);

        int[] arr = new int[length];
        input(arr);
        display(arr);
        inputXtoArray(arr);



    }

    static void inputXtoArray(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value X: ");
        int X = sc.nextInt();
        System.out.print("Input position: ");
        int position = sc.nextInt();
        int []arrCopy=new int[arr.length];
        if (position > 0 && position < arr.length) {
            for (int i=0;i<position;i++){
                arrCopy[i]=arr[i];
            }
            for (int i=position;i<arr.length;i++){
                arrCopy[i]=arr[i-1];
            }
            arrCopy[position]=X;
        }
        arr=arrCopy;
        display(arr);


    }


    static void input(int arr[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "]= ");
            arr[i] = sc.nextInt();
        }


    }
    static void display( int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "]=" + arr[i]);
            System.out.print("  ");
        }

    }


}
