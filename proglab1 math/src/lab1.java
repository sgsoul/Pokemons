public class lab1 {
    public static void PrintArray(double[][] arr){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 18; j++) {
            if (Double.isInfinite(arr[i][j])){
                System.out.print(" Inf\t\t");
            }
            else {
                System.out.printf("%6.3f\t\t", arr[i][j]);
            }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] a = new int[8];
        for (int i = 0; i < 8; i++) {
            a[i] = (17 - i * 2);
        }
        for (int i = 0; i < 8; i++) {
            System.out.print(a[i] + " ");
        }
    }
}