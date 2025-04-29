public class ithbit {
    
    public static int setithbit(int n, int i){
        int bitmask =1<<i;
        return n|bitmask;
    }
    public static int clearithbit(int n, int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
        
    }
        
    
    public static void main (String args[]){
        System.out.println(setithbit(10,2));
        System.out.println(clearithbit(10,1));
    }
    
}
