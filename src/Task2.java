public class Task2 {
    public static void main(String[] args) {
        char[] arrChar = new char[]{'a', 'z', 'd', 'y'};
        int[] arrInt = new int[arrChar.length];
        populate(arrInt, arrChar);
        float average = countAverage(arrInt);
        print(arrInt, average);
    }

    private static void print(int[] arrInt, float average) {
        for (int i = 0; i < arrInt.length; i++) {
            if((float)arrInt[i] > average) {
                System.out.println(arrInt[i]);
            };
        }
    }

    private static float countAverage(int[] arrInt) {
        int sum = 0;
        for (int i = 0; i < arrInt.length; i++) {
            sum+=arrInt[i];
        }

        return (float) sum/arrInt.length;
    }

    private static void populate(int[] arrInt, char[] arrChar) {
        for (int i = 0; i < arrChar.length; i++) {
            arrInt[i] = Character.getNumericValue(arrChar[i]);
            //System.out.println(arrInt[i] + " " + arrChar[i]);
        }

    }
}
