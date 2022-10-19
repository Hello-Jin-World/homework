import java.util.Scanner;

public class pyramid {
    public static void main(String[] args){
        System.out.print("Enter the height of the pyramid : ");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for (int i = 0 ; i < height ; i++){
            for (int j = height - 1 ; j > i ; j--){
                System.out.print(" ");
            }
            for (int k = 0 ; k < 2 * i + 1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
