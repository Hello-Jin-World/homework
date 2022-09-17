public class findmissnum {
    public static void main(String[] args){
        boolean miss = true;
        int[] num = {-5,-4,-3,-1};
        for (int i = 0 ; i < num.length - 1 ; i++){
            if (num[i+1]-num[i] > 1){
                miss = false;
                System.out.println("The excluded number is " + (num[i]+1) + ".");
                break;
            }
        }
        if (miss == true) {
            System.out.println("Nothing is missing.");
        }
    }
}
/*
* 두 숫자가 비교해서 2이상 차이나거나
 */