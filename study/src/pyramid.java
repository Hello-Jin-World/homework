import java.util.Scanner;

public class pyramid {
    public static void main(String[] args){
        System.out.print("높이를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for (int i = 0 ; i < height ; i++){
            for (int k = height - 1 ; k > i ; k--){
                System.out.print(" ");
            }
            for (int j = 0 ; j < 2 * i + 1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
