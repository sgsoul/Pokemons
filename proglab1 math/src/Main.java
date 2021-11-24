public class Main {
    public static void PrintArray(double[][] arr){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 18; j++) {
                    System.out.printf("%20.3f", arr[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int [] a = new int[8];
        for (int i = 0; i < 8; i++) {
            a[i] = (17-i*2);
        }


        float [] x = new float[18];
        for(int i = 0; i < 18; i++) {
            x[i] = (float) (Math.random() * 21.0f - 15.0f);
            if (x[i] > 5.0f) {
                x[i] = 5.0f;
            }
        }

        double [] []b = new double[8][18];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 18; j++) {
                double var;
                float xVal = x[j];
                if (a[i] == 9) {
                    var = Math.asin(Math.sin(Math.pow((Math.pow((2 * xVal), xVal) * ((xVal / 4) - 1)) , 3)));
                }
                else if (a[i] == 5 || a[i] == 7 || a[i] == 15 || a[i] == 17) {
                    var = Math.pow(((Math.cos(Math.tan(xVal))) / 2) , (Math.tan(Math.pow((xVal / 2),3))));
                }
                else {
                    double var1;
                    double var2;
                    var1 = (2 / 3) + Math.pow(((Math.tan(Math.sin(xVal)) + 1) / (Math.atan(Math.sin(xVal)))), 3);
                    var2 = Math.pow(((Math.pow(((1 / 2) * Math.pow(((xVal - (1 / 2)) / xVal), 2)), Math.pow(Math.E, xVal))) / (Math.cos(Math.pow(xVal,xVal)) - 1)), 3);
                    var = var1 / var2;
                }
                b[i][j] = var;

            }
        }

        PrintArray(b);

    }
}



