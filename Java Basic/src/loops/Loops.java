package loops;

public class Loops {
    public static void main(String[] args) {
        // while
        /*int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }*/

        // do-while
        /*do {
            System.out.println(i);
            i++;
        } while (i <= 10);*/

        // for
        /*for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }*/

        /*
         * 1
         * 10
         * 100
         * 1000
         * 10000
         * 100000
         * */
        /*for (int k = 1, j = 1; j <= 6; k *= 10, j++) {
            System.out.println(k);
        }*/

        /*--- OR ---*/
        /*int k = 1;
        for (int j = 1; j <= 6; j++) {
            System.out.println(k);
            k *= 10;
        }*/


        // sum of first 10 natural numbers
       /* int sum = 0;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println(sum);*/

        //count number of digits
        /*int number = 70430704;
        int res = 0;
        while (number > 0) {
            number = number/10;
            res ++;
        }
        System.out.println(res);*/

        //Factorial
        /*int n = 6;
        int res = 1;
        while (n > 0) {
            res = res * n;
            n--;
        }
        System.out.println(res);*/

        // Star Printing
        /* 1 ->
         *  *****
         *  *****
         *  *****
         *  *****
         *  *****
         * */

       /* for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/


        //Break and Continue
        int i = 0;
        /*while (i < 10) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
            i++;
        }*/
        /*while (i < 10) {
            if (i == 5) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }*/

        for (; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
