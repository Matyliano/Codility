import java.sql.SQLOutput;

public class Matrix {

    public int solution(int[][] A) {

        int saddlePoints = 0;
        int P;
        int Q;
        int min = A[1][1];
        int max = A[1][1];
        for (P = 1; P < A.length - 1; P++) {

            for (Q = 1; Q < A.length - 1; Q++) {
                if (A[1][Q] < min) {
                    min = A[1][Q];
                }
                for (P = 1; P < A[Q].length - 1; P++) {
                    if (A[P][1] > max) {
                        max = A[P][Q];
                    }
                }
                if (min == max) {
                    saddlePoints++;
                }
            }
        }
        System.out.println(saddlePoints);
        return saddlePoints;
    }
    public static void main( String[] args ) {
        Matrix matrix = new Matrix();
        int [][] A = {{0,1,9,3},{7,5,8,3},{9,2,9,4},{4,6,7,1}};
        matrix.solution( A);
    }
}
