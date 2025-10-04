public class OddOrEven {
    public static void CheckNumber(int n){
        int bitmask =1;
        if((n & bitmask) == 0){
            System.out.println("no. is even");
        }
        else{
            System.out.println("no. is odd");
        }
    }    
    public static void main(String[] args) {
        CheckNumber(130);
    }
}
