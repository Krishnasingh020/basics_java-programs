public class recursion {
    public static void Dec_num(int n ){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        Dec_num(n-1);
    }
    public static void main (String args[]){
        int n=10;
        Dec_num(n);
    }
}
