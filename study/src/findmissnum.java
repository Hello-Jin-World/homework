public class findmissnum {
    public static void main(String[] args){
        boolean miss = true;
        int[] num = {255, 257, 258};
        int x = num[0];
        for (int i = 0 ; i < num.length; i++){
            if (x != num[i]){
                miss = false;
                System.out.println("The excluded number is " + x + ".");
                break;
            }
            x++;
        }
        if (miss == true) {
            System.out.println("Nothing is missing.");
        }
    }
}
