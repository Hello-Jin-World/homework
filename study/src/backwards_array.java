import java.util.Scanner;

public class backwards_array {
    public static void main(String[] args){
        String temp = "";
        System.out.print("Enter array size : ");
        Scanner sc_size = new Scanner(System.in);
        int size = sc_size.nextInt();
        String[] arr = new String[size];// 여기까지 배열 사이즈 입력
        for (int i = 0 ; i < size ; i++){
            System.out.print("Enter number : ");
            Scanner sc_num = new Scanner(System.in);
            arr[i] = sc_num.nextLine();
        } // 하나씩 size 크기만큼 숫자를 받음
        System.out.print("Result : ");
        for (int i = 0 ; i < size / 2 ; i++){
            temp = arr[size - i - 1];
            arr[size - i - 1] = arr[i];
            arr[i] = temp; // 거꾸로 바꿔주는 로직
        }
        for (String i : arr){
            System.out.print(i + " ");
        }
    }
}