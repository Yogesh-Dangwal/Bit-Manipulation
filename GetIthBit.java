public class GetIthBit {
    public static int Get(int n,int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            System.out.print("ith bit is : ");
            return 0;
        }
        else{
            System.out.print("ith bit is : ");
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(Get(10,3));
    }
}
