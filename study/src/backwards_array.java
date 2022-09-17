import java.util.Scanner;

public class backwards_array {
    public static void main(String[] args){
        int temp = 0;
        System.out.print("Enter array size : ");
        Scanner sc_size = new Scanner(System.in);
        int size = sc_size.nextInt();
        int[] arr = new int[size];// 여기까지 배열 사이즈 입력
        for (int i = 0 ; i < size ; i++){
            System.out.print("Enter number : ");
            Scanner sc_num = new Scanner(System.in);
            arr[i] = sc_num.nextInt();
        } // 하나씩 size 크기만큼 숫자를 받음
        System.out.print("Result : ");
        for (int i = 0 ; i < size / 2 ; i++){
            temp = arr[size - i - 1];
            arr[size - i - 1] = arr[i];
            arr[i] = temp; // 거꾸로 바꿔주는 로직
        }
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
/*
* 하나씩 받기
* */