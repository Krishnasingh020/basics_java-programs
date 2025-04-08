import java.util.Scanner;
public class Javabasics{
    public static void dectobin(int binum){
        int pow =0;
        int decnum = 0;
        int mynum = binum;
        while(binum >0){
            int lastdigit =binum%10;
            decnum = decnum + (lastdigit * (int)Math.pow(2,pow));
            pow++;  
            binum = binum/10;
        }
        System.out.println("Decimal of " + mynum + " is " + decnum);
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a binary number: ");
    int binum = sc.nextInt();
    dectobin(binum);
}
}    