package arrays;

public class ArraysExample {
    public static void main(String[] args) {

       /* //Syntax
        // type[] variable;

        int[] arr = new int[10];
        arr[2] = 21;
        arr[6] = 34;

        int[] arr1 = {1, 2, 3, 4, 5};

        *//*for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }*//*

        // forEach Loop
        for (int i : arr1) {
            System.out.println(i);
        }*/


        // search element in an array
        /*int arr[] = {1, 3, 55,34, -12, 43};

        for (int i : arr) {
            if (i == 55) {
                System.out.println("Found");
            }
        }*/

        // find max number
        /*int arr[] = {1, 4, 32, 2, 54, 5};
        int res = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > res) {
                res = i;
            }
        }
        System.out.println(res);*/

        // reverse print array
        /*int arr[] = {1, 43, 54, 22, 11, 2, 3};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }*/

        // sum of array
        /*int arr[] = {1, 342, -43, 34, 54, 11};
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }

        System.out.println(sum);*/


       /* int[][] arr = new int[3][3];
        int[][] arr1 = {
                {1, 2, 4},
                {4, 2, 1},
                {5, 7, 8}
        };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }*/

       /* char arr[][] = new char[3][2];
        arr[0][0] = 'a';
        arr[0][1] = 'b';
        arr[1][0] = 'c';
        arr[1][1] = 'd';
        arr[2][0] = 'd';
        arr[2][1] = 'e';

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/

        // jagged array
        char arr[][] = new char[3][];
        arr[0] = new char[2];
        arr[1] = new char[3];
        arr[2] = new char[2];
        arr[0][0] = 'a';
        arr[0][1] = 'b';
        arr[1][0] = 'c';
        arr[1][1] = 'd';
        arr[1][2] = 'f';
        arr[2][0] = 'd';
        arr[2][1] = 'e';

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
