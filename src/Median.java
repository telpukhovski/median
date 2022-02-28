public class Median {
    private Median() {
    }

    public static void arraySort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int number = array[index];
            array[index] = array[i];
            array[i] = number;
        }
    }

    public static void arraySort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            double number = array[index];
            array[index] = array[i];
            array[i] = number;
        }
    }

    public static float median(int[] array) {
        arraySort(array);
        if (array.length % 2 != 0)
            return array[array.length / 2];
        else {
            return (float) (array[(array.length / 2) - 1] + array[array.length / 2]) / 2;
        }
    }

    public static double median(double[] array) {
        arraySort(array);
        if (array.length % 2 != 0)
            return array[array.length / 2];
        else {
            return (array[(array.length / 2) - 1] + array[array.length / 2]) / 2;
        }
    }
}