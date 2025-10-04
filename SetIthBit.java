public class SetIthBit {
    public static int Set(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(Set(10,2));
    }
}

