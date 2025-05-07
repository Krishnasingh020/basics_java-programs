public class recursion {
    public static void Inc_num(int n ){
        if (n==1){
            System.out.print(n + " ");
            return;
        }
        Inc_num(n-1); 
        System.out.print(n + " ");
        
    }
    public static void main (String args[]){
        int n=10;
        Inc_num(n);
    }
}
