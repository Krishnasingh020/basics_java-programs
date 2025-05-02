public class fastExponent {

    public static boolean isPowerof2(int n){
        return (n & (n-1))==0;
    }
    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            if((n & 1) !=0){
                count ++;
            }
            n= n>>1;
        }
        return count;
    }
    public static int fastexpo(int a,int n){
        int ans =1;

        while(n>0){
            if ((n & 1) !=0){//finding LSB
                ans = ans * a;
            }
            a =a*a;
            n = n>>1; // right shift
        }
        return ans;
    }
    public static void main (String args[]){
        System.out.println(isPowerof2(15));
        System.out.println(countsetbits(10));
        System.out.println(fastexpo(3,5));
    }
    
}
