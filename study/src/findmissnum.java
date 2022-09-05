public class findmissnum {
    public static void main(String[] args){
        float miss = 0.1f;
        int[] num = {-2, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = num[0];
        for (int i = 1 ; i < num.length + 1 ; i++){
            if (x != num[i-1]){
                miss = x;
                x = x+1;
            }
            x = x+1;
        }
        if (miss == 0.1f){
            System.out.println("Nothing is missing");
        }
        else {
            System.out.println((int) miss);
        }
    }
}
