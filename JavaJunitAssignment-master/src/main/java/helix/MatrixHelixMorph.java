package helix;

import java.util.ArrayList;
import java.util.List;

public class MatrixHelixMorph {

    /**
     * @param inMatrix
     * @return a matrix that is morphed into a helix version of inMatrix
     */
    public static int[][] helix(int[][] inMatrix) {
        int counter = 1;
        int rowBegin = 0;
        int rowEnd = inMatrix.length - 1;
        int columnBegin = 0;
        int columnEnd = inMatrix.length - 1;
        int colLength = inMatrix[0].length;
        int rowLength = inMatrix.length;
        int[][] result = new int[rowLength][colLength];

        while (rowBegin <= rowEnd && columnBegin <= columnEnd) {
            for (int i = columnBegin; i <= columnEnd; i++) {
                result[rowBegin][i] = counter;
                counter++;
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                result[i][columnEnd] = counter;
                counter++;
            }
            columnEnd--;

            if (rowBegin <= rowEnd) {
                for (int i = columnEnd; i >= columnBegin; i--) {
                    result[rowEnd][i] = counter++;

                }
            }
            rowEnd--;

            if (columnBegin <= columnEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    result[i][columnBegin] = counter++;
                }
                columnBegin++;
            }
        }
            return result;
        }
}




