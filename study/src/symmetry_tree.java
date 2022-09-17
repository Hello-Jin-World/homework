import java.util.Scanner;

public class symmetry_tree {
    public static void main(String[] args){
        System.out.print("Please enter height : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0 ; i < 2 * n + 1 ; i++){
            System.out.print("#");
        }
        System.out.println();
        for (int i = 0 ; i < n ; i++){
            System.out.print("#");
            for (int j = n - 1 ; j > i ; j--){
                System.out.print(" ");
            }
            for (int k = 0 ; k < 2 * i + 1 ; k++){
                System.out.print("*");
            }
            for (int j = n - 1 ; j > i ; j--){
                System.out.print(" ");
            }
            System.out.print("# \n");
        }
        for (int i = 0 ; i < n - 1 ; i++){
            System.out.print("#");
            for (int j = 0 ; j < i + 1 ; j++){
                System.out.print(" ");
            }
            for (int k = 2 * ( n - 1 ) ; k > 2 * i + 1 ; k--){
                System.out.print("*");
            }
            for (int j = 0 ; j < i + 1 ; j++){
                System.out.print(" ");
            }
            System.out.print("# \n");
        }
        for (int i = 0 ; i < 2 * n + 1 ; i++){
            System.out.print("#");
        }
    }
}
