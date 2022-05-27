package lesson3;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class lesson3 {
    public static void main(String[] args) {

        invertArray();
        fillArray ();
        multiplication ();
        fillDiagonal ();
        int [] arr5 = returnArray(10,7);
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i] + " ");
        }
        System.out.println();
        minAndMax ();
    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void fillArray () {
        int arr[] = new int [100];
        for(int i = 1; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void multiplication () {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6 ){
                arr[i] = arr[i]*2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillDiagonal () {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[0][0] = arr [0][3] = 1;
                arr[1][1] = arr [1][2]=1;
                arr[2][2] = arr [2][1]=1;
                arr[3][3] = arr [3][0]=1;

                System.out.print(arr[i][j] +" ");
            } System.out.println();
        }
        System.out.println();
    }
    public static int[] returnArray (int len, int initialValue) {
        int [] arr = new int [len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void minAndMax () {
        int [] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int min, max;
        min = max = nums[0];
        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("MIN and MAX : " + min + " " + max);
    }

}


