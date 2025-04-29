public class bit_manp {
    
    public static int clearibits(int n, int i){
        int bitmask = (~0)<<i;
        return n&bitmask;
    }

    public static int clearrangeofbits(int n, int i, int j){
        int a = (~0)<<j;
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n&bitmask;
    }

    
    public static void main (String args[]){
        System.out.println(clearibits(15,2));
        System.out.println(clearrangeofbits(10,2,4));
    }
    
}
