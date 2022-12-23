import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int countPositiveValues = 0;
        int[] values = new int[]{3, 5, -6, 3, 2, -9, 0, -123};
        countPositiveValues = countPositiveValues(values);
        int[] newArray = makeNewArray(countPositiveValues, values);
        System.out.println(Arrays.toString(newArray));
    }

    private static int[] makeNewArray(int countPositiveValues, int[] values) {
        int[] newArray = new int[countPositiveValues];
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            if(values[i] >= 0) {
                newArray[index] = values[i]*countPositiveValues;
                index++;
            }
        }

        return newArray;
    }

    private static int countPositiveValues(int[] values) {
        int counter = 0;

        for (int i = 0; i < values.length; i++) {
            if(values[i] >= 0) {
                counter++;
            }
        }

        return counter;
    }
}
