public class ClearLastBit {
    public static int Clear(int n,int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(Clear(15, 2)); 
    }
}
