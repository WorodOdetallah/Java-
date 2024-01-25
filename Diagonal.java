import java.util.Scanner;
//square matrix n*n=( row * col)
public class Diagonal {
    private double [][] matrix;
    public Diagonal(int n){
        matrix= new double[n][n];

    }
    public void setVal(int row, int col, double val){
        matrix[row][col] = val;
    }
    public double sumMain(){
        double sumMain = 0;
        for (int i = 0; i < matrix.length ; i++) {
            sumMain = sumMain + matrix[i][i];

        }

        return sumMain;
    }
    public double sumSecond(){
        double sumSecond = 0;
        for (int i = 0; i < matrix.length; i++)
            sumSecond = sumSecond + matrix[i] [matrix.length-1-i];
            return sumSecond;
        }

    public static void main(String[] args) {
        final int N=5;
        double val;
        Diagonal diagonalMat = new Diagonal(N);
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <N ; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println(" row : "  + i +  " col : "  + j +  " : ");
                val = in.nextDouble();
                diagonalMat.setVal(i,j,val);
            }
        }
        System.out.println("Main diagonal sum " + diagonalMat.sumMain());
        System.out.println("Secondary diagonal sum " + diagonalMat.sumSecond());
    }
    }



