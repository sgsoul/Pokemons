public class Var {
    public static void PrintArray(double[][] arr) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 18; j++) {
                if (Double.isInfinite(arr[i][j])) {
                    System.out.print(" Inf\t\t");
                } else {
                    System.out.printf("%6.3f\t\t", arr[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        long[] a = new long[9];
        for (int i = 0; i < 9; i++) {
            a[i] = (17 - i * 2);
        }
        for (int i = 0; i < 9; i++) {
            System.out.print(a[i] + " ");
        }
    }
}