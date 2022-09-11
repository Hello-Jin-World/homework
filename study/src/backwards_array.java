import java.util.Scanner;
import java.util.Spliterator;

public class backwards_array {
    public static void main(String[] args){
        System.out.print("Enter array size : ");
        Scanner sc_size = new Scanner(System.in);
        int size = sc_size.nextInt();
        char[] arr = new char[size]; // 여기까지 배열 사이즈 입력
        System.out.print("Enter number : ");
        Scanner sc_num = new Scanner(System.in);
        String num = sc_num.nextLine(); // 숫자를 문자열로 받음
        System.out.print("Result : ");
        for (int i = 0 ; i < size ; i++){
            arr[i] = num.charAt(size - i - 1);
            System.out.print(arr[i]);
        }
    }
}
