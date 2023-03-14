package org.varg;

import org.varg.Data.Matrix;
import org.varg.MathPackage.FromGauss;

public class Tests {
    public static void main(String[] args) {
        double[][] matrix = new double[][]{{2, -1, 3, 2},
                {1, -2, 1, 3},
                {3, -1, 3, 4}};

        Matrix matrix1  = new Matrix(1, matrix);
        System.out.println(FromGauss.determinant(matrix));
        double[] allX = FromGauss.reverseStroke(matrix);
        for (int i = 0; i < allX.length; i++) {
            System.out.println(allX[i]);
        }
    }
}
