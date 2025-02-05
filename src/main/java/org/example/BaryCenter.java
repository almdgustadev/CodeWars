package org.example;

import java.text.DecimalFormat;

public class BaryCenter {
    public static double[] barTriang(double[] x, double[] y, double[] z) {
        double[] result = new double[2]; // crinado um array para armazenar as coordenadas do baricentro
        result[0] = (x[0] + y[0] + z[0]) / 3; // armazenando o resultado de x0
        result[1] = (x[1] + y[1] + z[1]) / 3; // armazenando o resultdo de y0
        DecimalFormat df = new DecimalFormat("#.####");// criando um objeto DecimalFoormat para formatar as coordenadas em 4 casas decimais

        result[0] = Double.parseDouble(df.format(result[0]));
        result[1] = Double.parseDouble(df.format(result[1])); // formatando tanto x0 quanto y0 para 4 casa decimais utilizando df.format

        return result;
    }

}
