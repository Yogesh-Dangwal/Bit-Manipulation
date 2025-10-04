public class ModularExponentiation {
    public static int ModExpo(int x, int y, int p){
        int ans = 1;
        while(y > 0){
            if(y % 2 == 1){
                ans *= x;
            }
            x *= x;
            y >>= 1;


            
        }
        return ans % p;
    }
    public static void main(String[] args) {
        System.out.println(ModExpo(2, 5, 13)); //(2^5)%13 
    }
}
