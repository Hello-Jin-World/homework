import java.util.Scanner;

public class findminmax {
    public static void main(String[] args){
        System.out.print("Enter array size : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0 ; i < size ; i++){
            System.out.print("Enter number : ");
            Scanner sc_num = new Scanner(System.in);
            arr[i] = sc_num.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Max:" + max + " Min:" + min);
    }
}
