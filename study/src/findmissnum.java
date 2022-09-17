public class findmissnum {
    public static void main(String[] args){
        boolean miss = true;
        int[] num = {-5,-4,-3,-2,0};
        if (num.length == 0){
            miss = false;
            System.out.println("Array is empty.");
        }
        for (int i = 0 ; i < num.length - 1 ; i++){
            if (num[i] - num[i+1] < -1){
                miss = false;
                System.out.println("The excluded number is " + (num[i]+1) + ".");
                break;
            }
            if (num[i] == num[i+1]){
                miss = false;
                System.out.println("It's the same number.");
                break;
            }
        }
        if (miss) {
            System.out.println("Nothing is missing.");
        }
    }
}
/*
* 두 숫자가 비교해서 2이상 차이나거나
 */