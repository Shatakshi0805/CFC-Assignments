package assignments2;

public class buyAndSell1 {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        int max = arr[arr.length-1];
        int min = arr[arr.length-1];
        int minInd = arr.length-1;//most imp
        int maxInd = arr.length-1;

        for (int i = arr.length-2; i >= 0; i--) {
            if (arr[i] < min) {//finds min of all
                min = arr[i];
                minInd = i;
            }
        }

        for (int j = arr.length-2; j >= 0; j--) {
            if (max < arr[j] && j > minInd) {//to not consider the ones that come before the min stock value
                max = arr[j];
                maxInd = j;
            }
        }

        if (minInd < maxInd && min != max) {
            System.out.println("maximum profit is " + (max-min));
        } else {
            System.out.println("maximum profit is 0");
        }
    }
}
