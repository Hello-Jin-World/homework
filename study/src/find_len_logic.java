import java.util.Scanner;

public class find_len_logic {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0 ;; i++){
            if (n == 0){
                num = i;
                break;
            }
            n = n / 10;
        }
        System.out.print(num);
    }
}
