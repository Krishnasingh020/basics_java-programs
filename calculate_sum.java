public class recursion {
    public static int calc_sum(int n){
        if (n == 1){
            return 1;
        }
        int sumn1 = calc_sum(n - 1);
        int sum = sumn1 + n;
        return sum;
    }
    public static void main(String args[]){
        int n =5;
        System.out.println(calc_sum(n));
    }
}
