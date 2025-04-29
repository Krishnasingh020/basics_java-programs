public class binarytodecimal {
    public static int dec_to_bin(int n){
        int bin = 0;// binary number 
        int pow = 1;//power of 10
        while (n > 0){
            int last_digit = n % 2;//last digit of binary number
            n = n / 2;
            bin += last_digit * pow;//adding last digit to binary number
            pow *= 10;//increasing  power of 10
        }
        return bin;
    }

    public static void main (String args[]){
        int n = 200;
        System.out.println(dec_to_bin(n));
    }
    
}
