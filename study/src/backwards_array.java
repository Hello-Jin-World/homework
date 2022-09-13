import java.util.Scanner;
import java.util.Spliterator;

public class backwards_array {
    public static void main(String[] args){
        int temp = 0;
        System.out.print("Enter array size : ");
        Scanner sc_size = new Scanner(System.in);
        int size = sc_size.nextInt();
        int[] arr = new int[size];// 여기까지 배열 사이즈 입력
        System.out.print("Enter number : ");
        Scanner sc_num = new Scanner(System.in);
        int num = sc_num.nextInt(); // 숫자를 배열로 받음
        for (int i = 0 ; i < (int)Math.log10(num)+1 ; i++){
            arr[i] = (int)((num / Math.pow(10, (int)Math.log10(num) - i)) % 10);
        }
        System.out.print("Result : ");
        for (int i = 0 ; i < size / 2 ; i++){
            temp = arr[size - i - 1];
            arr[size - i - 1] = arr[i];
            arr[i] = temp; // 거꾸로 바꿔주는 로직
        }
        for (int i : arr){
            System.out.print(i);
        }
    }
}
