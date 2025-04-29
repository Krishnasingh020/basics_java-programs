public class get_bit {
    // Get ith bit of a number
    public static int getithbit(int n, int i){
        int bitmask =1<<i;// left shift 1 by i positions
        // if ith bit is 1 then n & bitmask will be non zero
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    
    public static void main (String args[]){
        System.out.println(getithbit(10,3));
    }
    
}
