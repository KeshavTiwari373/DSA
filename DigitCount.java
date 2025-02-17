import java.util.*;
public class DigitCount {
    public static void main(String[] args) {
        int n = 12345;
        int num = n;

        //Count no of digits
        // int counter = 0;
        // while (num != 0) {
        //     num = num / 10;
        //     System.out.println(num);
        //     counter ++;
        //     System.out.println(counter);
        // }

        int optcount = (int)(Math.log10(n) + 1); //usong log

        System.out.println(optcount);

        int revnum = 0;
        while (num > 0) {
            revnum = num % 10;
            revnum = revnum ;
            num = num / 10;


        }
    }
}
