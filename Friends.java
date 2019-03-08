
/**
 * File Name: Friends.java
 * @author Boyu Lu
 * @year 2019
 */
public class Friends{
    private int max ;

    Friends(int n) {
        max = n ;
        alg();
    }

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
        int n =  100000000 ;
        Friends a = new Friends(n) ;
    }

    public static void main(String[] args) {
        System.out.println("Friends.java starts") ;
        test();
        System.out.println("Friends.java ends") ;
    }
}
