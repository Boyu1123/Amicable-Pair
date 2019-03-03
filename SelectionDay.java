import java.util.Arrays;

/**
 * File Name: SelectionDay.java 
 * @author Boyu Lu
 * @year 2019
 */

class SelectionDay {
    private final int N = 25;
    private final int S = 3;
    protected int [] a = new int[N] ;
    protected int [] s = new int[S] ;
    int itr = 0 ;
    SelectionDay() {
        SimpleTest();
    }

    private void SimpleTest() {
        {
            for (int i = 0; i < N; i++) {
            a[i] = i;
            }
            int itr = race();
        }
       
        {
            for (int j = 0; j < N; j++) {
            a[j] = N-1-j;
            }
            int itr = race();
        }

        {
            int b[] = {2,6,3,8,0,7,9,1,12,18,11,10,14,22,15,19,23,24,4,13,5,15,21,17,20};
            for (int k = 0; k < N; k++) {
                a[k] = b[k];
            }
            int itr = race();
        }
    }

    protected int race() {
        itr = 0 ;
        alg() ;
        return itr ;
    }

    private void alg() {
        int b[] = new int[5];
        int d[] = new int[6];
        int temp[] = new int[5];
        int oder[] = new int[5];

        for (int i = 0; i < 5; i++) {
            b[i] = a[i];
        }
        Arrays.sort(b);
        itr++;
        temp[0] = b[0];

        for (int i = 5; i < 10; i++) {
            b[i-5] = a[i];
        }
        Arrays.sort(b);
        itr++;
        temp[1] = b[0];
        for (int i = 10; i < 15; i++) {
            b[i-10] = a[i];
        }
        Arrays.sort(b);
        itr++;
        temp[2] = b[0];
        for (int i = 15; i < 20; i++) {
            b[i-15] = a[i];
        }
        Arrays.sort(b);
        itr++;
        temp[3] = b[0];
        for (int i = 20; i < 25; i++) {
            b[i-20] = a[i];
        }
        Arrays.sort(b);
        itr++;
        temp[4] = b[0];
        for (int j = 0; j < 5; j++) {
            oder[j] = temp[j];
        }
        Arrays.sort(oder);
        itr++;
        for (int k = 0; k < 5; k++) {
            if (oder[0] == temp[k]) {
                d[0] = 0;
                for (int n = 5*k; n < 5*k+5; n++) {
                    b[n-5*k] = a[n];
                }
                Arrays.sort(b);
                d[1] = b[1];
                d[2] = b[2];
            }
            if (oder[1] == temp[k]) {
                for (int n = 5*k; n < 5*k+5; n++) {
                    b[n-5*k] = a[n];
                }
                Arrays.sort(b);
                d[3] = b[0];
                d[4] = b[1];
            }
            if (oder[2] == temp[k]) {
                for (int n = 5*k; n < 5*k+5; n++) {
                    b[n-5*k] = a[n];
                }
                Arrays.sort(b);
                d[5] = b[0];
            }
        }
        Arrays.sort(d);
        itr ++;

        for (int i = 0; i < 25; i++) {
            if (a[i] == d[0]) {
                s[0] = i;
            }
            if (a[i] == d[1]) {
                s[1] = i;
            }
            if (a[i] == d[2]) {
                s[2] = i;
            }
        }
       System.out.println(s[0] + " " + s[1] + " " + s[2]);
       System.out.println("This method needs " + itr + " times tracking");
    }

    public static void main(String[] args) {
        System.out.println("SelectionDay problem STARTS");
        SelectionDay m = new SelectionDay() ;
        System.out.println("SelectionDay problem ENDS");
    }
}