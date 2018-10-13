package app;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*--Fields--*/
		double[] row1 = {1.0, 1.5, 2.0};
		double[] row2 = {1.5, 2.0, 2.5};
		double[] row3 = {2.0, 2.5, 3.0};
		double[][] matrix = new double[3][];
		double sum = 0;
		double sum1 = 1;
		double sum2 = 1;
		/*--Assignation--*/
		matrix[0] = row1;
		matrix[1] = row2;
		matrix[2] = row3;
		
		System.out.print("Suma iloczynów przek¹tnych tablicy: ");
		for(int i=0; i<matrix.length; i++) {
			sum1 = sum1*matrix[i][i];
			sum2 = sum2*matrix[i][matrix.length - 1 - i];
		}
		System.out.println((sum1+sum2) + ".");
		
		System.out.print("Iloczyn sum œrodkowego wiersza i œrodkowej kolumny: ");
		sum = (matrix[0][1] + matrix[1][1] + matrix[2][1])*(matrix[1][0] + matrix[1][1] + matrix[1][2]);
		System.out.println(sum + ".");
		
		System.out.print("Suma wartoœci znajduj¹cych sie przy krawdedzi: ");
		sum = matrix[0][0] + matrix[0][1] + matrix[0][2] +
				matrix[1][0] + matrix[1][2] + 
				matrix[2][0] + matrix[2][1] + matrix[2][2]; 
		System.out.println(sum + ".");
		
	}
}
