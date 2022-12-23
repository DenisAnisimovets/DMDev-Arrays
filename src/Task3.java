public class Task3 {
    public static void main(String[] args) {
        int [] arr = new int[] {5, 9, 5, -10, 123, 0, 4, 3};
        int [][] arr3 = splitArray(arr);

    }

    private static int[][] splitArray(int[] arr) {
        int [][] newArray = new int[3][];
        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter=0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == 0) {
                zeroCounter++;
            } else if(arr[i] > 0) {
                positiveCounter++;
            } else {
                negativeCounter++;
            }
        }

        int [] positiveArray = new int[positiveCounter];
        int [] negativeArray = new int[negativeCounter];
        int [] zeroArray = new int[zeroCounter];
        positiveCounter = 0;
        negativeCounter = 0;
        zeroCounter = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == 0) {
                zeroArray[zeroCounter] = arr[i];
                zeroCounter++;
            } else if(arr[i] > 0) {
                positiveArray[positiveCounter] = arr[i];
                positiveCounter++;
            } else {
                negativeArray[negativeCounter] = arr[i];
                negativeCounter++;
            }
        }

        newArray[0] = positiveArray;
        newArray[1] = negativeArray;
        newArray[2] = zeroArray;

        return newArray;

    }
}
