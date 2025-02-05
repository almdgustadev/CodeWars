package org.example;

import java.text.DecimalFormat;

public class BaryCenter {
    public static double[] barTriang(double[] x, double[] y, double[] z) {
        double[] result = new double[2];
        result[0] = (x[0] + y[0] + z[0]) / 3;
        result[1] = (x[1] + y[1] + z[1]) / 3;
        DecimalFormat df = new DecimalFormat("#.####");

        result[0] = Double.parseDouble(df.format(result[0]));
        result[1] = Double.parseDouble(df.format(result[1]));

        return result;
    }

}
