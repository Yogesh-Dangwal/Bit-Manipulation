public class UpdateIthBit {
    public static int Clear(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int Set(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int Update(int n, int i, int newbit){
        // if(newbit == 0){
        //     return Clear(n , i);
        // }
        // else{
        //     return Set(n , i);
        // }
        n = Clear(n , i);
        int bitmask = newbit << i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(Update(10, 2, 1));
    }
}
