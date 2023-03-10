public class MaxValue {
    public static void main(String[] args) {
        int[] array = { 72, 34, 53, 23, 43, 23, 45, 69, 71, 95, 52, 12, 34, 33, 73, 40, 50, 20, 99, 71, 24, 53, 24, 53, 29, 40 };
        System.out.println(maxValue(array));

        int[] array2 = { 72, 34, 53, 23, 43, 23, 43, 23, 45, 69 }
                ;
        System.out.println(maxValue(array2));
    }
    public static int maxValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
