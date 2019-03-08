import java.io.FileWriter;
import java.io.IOException;

/**
 * File Name: Friends.java
 *
 * @author Jagadeesh Vasudevamurthy
 * @year 2019
 *
 * To compile: RandomInt.java IntUtil.java Friends.java
 */
public class Friends{
    private int max ;
    static IntUtil u = new IntUtil() ;

    /*
     * Constructor
     */
    Friends(int n) {
        max = n ;
        alg();
    }

    /*
     *
     */
    private void alg() {
        int friendNumbers[] = new int[max+1];
        for (int i = 1; i < max; i++) {
            for (int j = 2; i*j < max; j++) {
                friendNumbers[i*j] += i;
            }
        }
        for (int n = 2; n < max; n++) {
            if (friendNumbers[n] > max) {
                continue;
            }
            if (friendNumbers[friendNumbers[n]] == n && friendNumbers[n] != n) {
                System.out.println(n + " " + friendNumbers[n]);
                friendNumbers[n] = 0;
            }
        }
    }

    private static void test() {
        //int n = 10000;
        int n =  100000000 ;
        long startTime = System.nanoTime();
        Friends a = new Friends(n) ;
        long endTime = System.nanoTime();
        double d2 = u.timeInSec(endTime,startTime) ;
        System.out.println("Run time r n = " + a.max + " is " + d2 + " secs" ) ;
    }

    public static void main(String[] args) {
        System.out.println("Friends.java starts") ;
        test();
        System.out.println("If you can do in less than 20 secs, you will get FULL points") ;
        System.out.println("Attach Friends.java, output of your program as a pdf file") ;
        System.out.println("Attach a word file, explaining why your method is fast") ;
        System.out.println("Friends.java ends") ;
    }
}