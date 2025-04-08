package methods;

public class MethodExample {
    public static void main(String[] args) {
      /*  int[] a = {1, 4, 65, 54, 34};
        System.out.println(sumOfArray(a));

        int[] b = {94, 65, 4, 2, 12, 4};
        System.out.println(sumOfArray(b));

        System.out.println(upperFun("   fkdlk df    "));

        System.out.println(sum(10,2));
        System.out.println(sum(10, 34,1));
        System.out.println(sum(1, 2, 3 ,4));*/

        System.out.println(isPrime(13));
        System.out.println(isPrime(54));
        System.out.println(isPrime(47));
        System.out.println(isPrime(35));
    }

    // methods (function)
    public static int sumOfArray(int[] arr) {
        int res = 0;
        for (int i : arr) {
            res += i;
        }
        return res;
    }

    private static String upperFun(String str) {
        return str.trim().toUpperCase();
    }

    // method overloading
    private static int sum(int a, int b) {
        return a + b;
    }

    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // variable args
    private static int sum(int ... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static boolean isPrime(int x) {
        int res = 0;

        for (int i = 1; i < x / 2; i++) {
            if (x % i == 0) {
                res ++;
            }
        }

        return res == 1;
    }
}
