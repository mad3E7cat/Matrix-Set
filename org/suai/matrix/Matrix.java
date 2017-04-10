package org.suai.matrix;
import org.suai.exception.*;
public class Matrix{
	protected int rows;
	protected int columns;
	protected int[][] matrix;
	public Matrix(int r, int c){
		rows = r;
		columns = c;
		matrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = 0;
			}
		}
	}
	public int getRows(){
		return rows;
	}
	public int getColumns(){
		return columns;
	} 
	public void setElement(int i, int j, int value) throws ExtendedException { 
		if((i < 0) || (j < 0) || (i > rows) || (j > columns)) throw new ExtendedException("No such element: [" + i + "]" + "[" + j + "]");
		matrix[i][j] = value;
	}
	public int getElement(int i, int j) throws ExtendedException { 
		if((i < 0) || (j < 0) || (i > rows) || (j > columns)) throw new ExtendedException("No such element: [" + i + "]" + "[" + j+ "]");
		return matrix[i][j];
	}
	public Matrix sum(final Matrix m) throws SumException{
		if(rows != m.getRows() || columns != m.getColumns()) throw new SumException("Matrices are not equal by rows/columns...");
		Matrix res = new Matrix(rows, columns);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				res.setElement(i, j, (this.getElement(i,j) + m.getElement(i,j)));
			}
		}
		return res;
	}
	public Matrix product(final Matrix m) throws ExtendedException { 
		if(columns != m.getRows()) throw new ExtendedException("Columns of left operand != rows of right operand...");
		Matrix res = new Matrix(rows, m.getColumns());
		int strSum = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < m.getColumns(); j++) {
				for (int k = 0; k < columns; k++) {
					strSum += this.getElement(i,k) * m.getElement(k, j); // i,k exactly
				}
				res.setElement(i, j, strSum);
				strSum = 0;
			}
		}
		return res;
	}
	public String toString(){
		String str = "";
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				str += this.getElement(i,j) + " ";
			}
			str += "\n";
		}
		return str; 
	}
	public boolean equals(final Object m){
		if(m instanceof Integer) throw new IllegalArgumentException("Incompitable types: Matrix and Integer");
		if(!(m instanceof Matrix)) return false;
		Matrix obj = (Matrix) m; // cast
		if((rows != obj.getRows()) || (columns != obj.getColumns())) return false;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if(matrix[i][j] != obj.getElement(i,j)) return false;
			}
		}
		return true;
	}
}


/*

***конструкторы с параметрами размерами матриц, создающие нулевую матрицу для
Matrix
***единичную для SquareMatrix
***Matrix sum(Matrix) 
***Matrix product(Matrix)
***метод sum должен быть перекрыт в SquareMatrix
***setElement(int row, int column, int value) 
***getElement(int row, int column)
***toString()
***RuntimeException extending class

*/